package com.zeroxrwx.smarthome.repositories;

import com.zeroxrwx.smarthome.models.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UsersRepository extends CrudRepository<User, Long> {

}