package com.ztp.cloud.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ztp.cloud.db.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
