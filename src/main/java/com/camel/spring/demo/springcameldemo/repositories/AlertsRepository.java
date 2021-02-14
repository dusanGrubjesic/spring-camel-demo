package com.camel.spring.demo.springcameldemo.repositories;

import com.camel.spring.demo.springcameldemo.entities.Alert;
import com.camel.spring.demo.springcameldemo.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.Optional;

@RepositoryRestResource
public interface AlertsRepository extends CrudRepository<Alert, Long> {
    Optional<Alert> findByUser(User user);
}
