package com.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.main.User;




@Repository
public interface RegistartionRepository extends JpaRepository<User,Long>  {
 public User findByEmailId(String emailId);
 public User findByEmailIdAndPassword(String emailId,String password);
}
