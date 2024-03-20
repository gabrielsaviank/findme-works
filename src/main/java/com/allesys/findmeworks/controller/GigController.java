package com.allesys.findmeworks.controller;

import com.allesys.findmeworks.dto.GigDTO;
import com.allesys.findmeworks.entity.Gig;
import com.allesys.findmeworks.service.GigService.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/gigs")
public class GigController {
    private final GigService gigService;

    @Autowired
    public GigController(GigService gigService) {
        this.gigService = gigService;
    }

    @PostMapping("/create")
    public Gig createGig(@RequestBody GigDTO gigRequest) {
        return gigService.createGig(gigRequest);
    }

    @GetMapping
    public List<Gig> getAllGigs() {
        return gigService.getAllGigs();
    }
}
