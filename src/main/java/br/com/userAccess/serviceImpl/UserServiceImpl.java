package br.com.userAccess.serviceImpl;

import br.com.userAccess.domain.User;
import br.com.userAccess.exception.ObjectNotFoundException;
import br.com.userAccess.repository.UserRepository;
import br.com.userAccess.service.UserService;
import br.com.userAccess.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author Marcelo Nascimento
 * @Date 18 de fev de 2019
 * @Project user-access
 * @Package br.com.userAccess.service
 * @Desc This class has the rules about User. 
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public List<User> all() {
		return userRepository.findAll();
	}

	@Override
	public Page<User> paginateUser(final Integer page, final Integer linesPerPage, final String orderBy, final String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return userRepository.findAll(pageRequest);
	}

	@Override
	public User findByUsername(final String username) {
		return userRepository.findByUsername(username)
					.orElseThrow(() -> new ObjectNotFoundException("username not found!"));
	}

	@Transactional
	@Override
	public User create(User user) {
		user.setPassword(encodePassword(user));
		return userRepository.save(user);
	}

	@Override
	public User findOne(Integer id) {
		return userRepository.findOne(id);
	}

	@Override
	public void update(User user, Integer id) {
		final User userEditable = findOne(id);
		userEditable.getClient().setEmail(user.getClient().getEmail());
		userEditable.getClient().setName(user.getClient().getName());
		userRepository.save(userEditable);
	}

	private String encodePassword(User user) {
		return bCryptPasswordEncoder.encode(user.getPassword());
	}

	@Override
	public User myProfile() {
		return findOne(Utils.authenticated().getId());
	}
}
