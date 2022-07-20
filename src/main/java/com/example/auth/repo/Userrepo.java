package com.example.auth.repo;

import com.example.auth.domain.Auser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Userrepo extends JpaRepository<Auser,Long> {

    Auser findByName(String name);
}
