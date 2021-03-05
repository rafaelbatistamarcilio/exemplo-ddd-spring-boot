package br.com.userAccess.domain.dto;

import br.com.userAccess.domain.Client;
import br.com.userAccess.domain.User;

import java.io.Serializable;

/**
 * @Author Marcelo Nascimento
 * @Date 18 de fev de 2019
 * @Project user-access
 * @Package br.com.userAccess.domain.dto
 * @Desc 
 */
public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private ClientDTO clientDTO;

	public UserDTO() { }

	public UserDTO(String username, String password) {
		this.username = username;
		this.password = password;
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

	public ClientDTO getClientDTO() {
		return clientDTO;
	}

	public void setClientDTO(ClientDTO clientDTO) {
		this.clientDTO = clientDTO;
	}

	public User fromEntity() {
		final User user = new User(getUsername(), getPassword());
		final Client client = new Client(user.getClient().getEmail(), user.getClient().getName(), user);
		user.setClient(client);
		return user;
	}
}
