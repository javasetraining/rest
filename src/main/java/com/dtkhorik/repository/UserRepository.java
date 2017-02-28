package com.dtkhorik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dtkhorik.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
