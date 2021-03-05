package br.com.userAccess.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.userAccess.domain.User;

/**
 * @Author Marcelo Nascimento
 * @Date 18 de fev de 2019
 * @Project user-access
 * @Package br.com.userAccess.repository
 * @Desc User Repository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);

}
