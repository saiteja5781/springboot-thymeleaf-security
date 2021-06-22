package com.vm.springboot.security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vm.springboot.security.demo.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

}