package com.example.auth.repo;

import com.example.auth.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rolerepo extends JpaRepository<Role,Long> {
     Role findByName(String name);
}
