package com.vm.springboot.security.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vm.springboot.security.demo.entities.User;


/**
 * @author Ramesh Fadatare
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{
	Optional<User> findByEmail(String email);
}