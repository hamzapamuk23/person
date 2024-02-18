package com.startech.person.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.startech.person.entities.user.User;

@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<UUID, User>, JpaSpecificationExecutor<User> {

}
