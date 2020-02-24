package com.cts.training.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.user.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
