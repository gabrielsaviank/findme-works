package com.allesys.findmeworks.repository;

import com.allesys.findmeworks.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {

}
