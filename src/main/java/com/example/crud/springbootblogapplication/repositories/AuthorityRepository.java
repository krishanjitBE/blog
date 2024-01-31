package com.example.crud.springbootblogapplication.repositories;

import com.example.crud.springbootblogapplication.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
