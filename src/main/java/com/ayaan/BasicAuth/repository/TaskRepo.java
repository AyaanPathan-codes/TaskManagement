package com.ayaan.BasicAuth.repository;

import com.ayaan.BasicAuth.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Tasks,Integer> {
}
