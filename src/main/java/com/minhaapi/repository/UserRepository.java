package com.minhaapi.repository;

import org.springframework.data.repository.CrudRepository;
import com.minhaapi.domain.User;

// CRUD refere a Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Long> {

}
