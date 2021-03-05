package br.com.userAccess.service;

import br.com.userAccess.domain.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author Marcelo Nascimento
 * @Date 18 de fev de 2019
 * @Project user-access
 * @Package br.com.userAccess.service
 * @Desc Interface to contract to User.
 */
public interface UserService {


	List<User> all();

	Page<User> paginateUser(Integer page, Integer linesPerPage, String orderBy, String direction);

	User findByUsername(String username);

	User create(User user);

	User findOne(Integer id);

	void update(User user, Integer id);

	User myProfile();
}
