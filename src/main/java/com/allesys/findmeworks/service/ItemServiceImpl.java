package com.allesys.findmeworks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allesys.findmeworks.entity.Item;
import com.allesys.findmeworks.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @Override
    public Item createItem(Item item){
        return itemRepository.save(item);
    }
}