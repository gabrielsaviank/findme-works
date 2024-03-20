package com.allesys.findmeworks.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allesys.findmeworks.entity.Location;

public interface LocationRepository extends JpaRepository<Location, UUID>{}
