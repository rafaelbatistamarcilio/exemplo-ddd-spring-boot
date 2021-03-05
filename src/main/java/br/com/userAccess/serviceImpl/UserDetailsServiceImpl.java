package br.com.userAccess.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.userAccess.config.security.UserSpringSecurity;
import br.com.userAccess.domain.User;
import br.com.userAccess.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user =  userRepository.findByUsername(username)
					.orElseThrow(() -> new UsernameNotFoundException(username));

		return new UserSpringSecurity(user.getId(), user.getUsername(), user.getPassword(), user.getProfiles());
	}
}
