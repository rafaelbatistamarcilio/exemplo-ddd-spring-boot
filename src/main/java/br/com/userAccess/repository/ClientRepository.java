package br.com.userAccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.userAccess.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
