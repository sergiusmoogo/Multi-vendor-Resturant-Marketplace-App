package com.sergius.co.ke.allconceptsapp.repository;

import com.sergius.co.ke.allconceptsapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //JPQL
    @Query(value = "select u from User u where u.id=?1")
    User findUserById(Integer id);

    //Native Query
    @Query(value = "select * from user where username=?1", nativeQuery = true)
    User findUserByUsername(String username);
}
