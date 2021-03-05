package br.com.userAccess.domain;

import br.com.userAccess.domain.enums.Profile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String username;
	private String password;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="PROFILES")
	private Set<Integer> profiles = new HashSet<>();

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Client client;

	public User() {
		
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		addProfiles(Profile.USER);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Profile> getProfiles() {
		return profiles
					.stream()
					.map(code -> Profile.toEnum(code))
					.collect(Collectors.toSet());
	}

	public void addProfiles(Profile profile) {
		profiles.add(profile.getCode());
	}

	public Client fromClient() {
		final User user = new User();
		user.setId(getId());
		return new Client(getClient().getEmail(), getClient().getName(), user);
	}
}
