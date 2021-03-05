package br.com.userAccess;

import br.com.userAccess.domain.Client;
import br.com.userAccess.domain.User;
import br.com.userAccess.repository.ClientRepository;
import br.com.userAccess.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableEurekaClient
public class UserAccessApplication  implements CommandLineRunner {
	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(UserAccessApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		userRepository.deleteAll();
		clientRepository.deleteAll();
		final User user = userRepository.save(new User("crane", bCryptPasswordEncoder.encode("123")));
		clientRepository.save(new Client("crane@gmail.com", "kyle Crane", user));
	}

}

