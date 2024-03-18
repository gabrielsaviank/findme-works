package com.allesys.findmeworks.repository;

import com.allesys.findmeworks.entity.Gig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GigRepository extends JpaRepository<Gig, UUID> {}
