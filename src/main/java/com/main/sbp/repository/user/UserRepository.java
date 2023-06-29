package com.main.sbp.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.sbp.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
