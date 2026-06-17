package com.ayaan.BasicAuth.repository;

import com.ayaan.BasicAuth.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users,Long>{


    Optional<Users> findByUsername(String username);
};
