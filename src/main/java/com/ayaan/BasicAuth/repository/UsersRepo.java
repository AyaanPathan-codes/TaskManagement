package com.ayaan.BasicAuth.repository;

import com.ayaan.BasicAuth.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users,Long>{

};
