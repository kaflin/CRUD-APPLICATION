package com.kaflin.repository;


import org.springframework.data.repository.CrudRepository;

import com.kaflin.Model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	 public User findById(int id);
public User findByUsernameAndPassword(String username,String password);
}
