package com.allesys.findmeworks.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allesys.findmeworks.entity.User;

public interface UserRepository extends JpaRepository<User, UUID>{}