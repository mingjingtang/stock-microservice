package com.example.userservice.repository;

import com.example.userservice.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("FROM User u WHERE u.email = ?1 and u.password = ?2")
    public User login(String email, String password);

}
