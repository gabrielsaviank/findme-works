package com.allesys.findmeworks.repository;

import java.util.UUID;

import com.allesys.findmeworks.entity.Location;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.allesys.findmeworks.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, UUID>{}
