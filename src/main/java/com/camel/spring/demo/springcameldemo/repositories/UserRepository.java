package com.camel.spring.demo.springcameldemo.repositories;

import com.camel.spring.demo.springcameldemo.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {
}
