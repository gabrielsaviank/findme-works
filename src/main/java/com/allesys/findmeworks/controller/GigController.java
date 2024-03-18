package com.allesys.findmeworks.controller;

import com.allesys.findmeworks.entity.Gig;
import com.allesys.findmeworks.entity.Location;
import com.allesys.findmeworks.service.GigService.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/gigs")
public class GigController {
    private final GigService gigService;

    @Autowired
    public GigController(GigService gigService) {
        this.gigService = gigService;
    }

    @PostMapping("/create/{userId}")
    public Gig createGig(@PathVariable("userId") UUID userId, @RequestBody Gig gig, Location location) {
        System.out.println("GIG" + gig);
        return gigService.createGig(gig, userId);
//        return gigService.createGig(gig, userId, location);
    }

    @GetMapping
    public List<Gig> getAllGigs() {
        return gigService.getAllGigs();
    }
}
