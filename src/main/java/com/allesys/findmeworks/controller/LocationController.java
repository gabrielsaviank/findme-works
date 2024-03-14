package com.allesys.findmeworks.controller;

import java.util.List;
import java.util.UUID;

import com.allesys.findmeworks.entity.User;
import com.allesys.findmeworks.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allesys.findmeworks.entity.Location;
import com.allesys.findmeworks.service.LocationService.LocationService;

@RestController
@RequestMapping("/api/v1/locations")
public class LocationController {
    private final LocationService locationService;
    private final UserService userService;

    @Autowired
    public LocationController(LocationService locationService, UserService userService) {
        this.locationService = locationService;
        this.userService = userService;
    }

    @PostMapping("/create/{userId}")
    public Location createLocation(@PathVariable("userId") UUID userId, @RequestBody Location location) {
        User user = userService.getUserById(userId);
        return locationService.createLocation(location, user);
    }

    @GetMapping
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/{id}")
    public Location getLocationById(@PathVariable UUID id) {
        return locationService.getLocationById(id);
    }

    @GetMapping("/delete/{id}")
    public void deleteLocation(@PathVariable UUID id) {
        locationService.deleteLocation(id);
    }
}
