package com.allesys.findmeworks.service.LocationService;

import java.util.List;
import java.util.UUID;

import com.allesys.findmeworks.entity.Location;
import com.allesys.findmeworks.entity.User;

public interface LocationService {
    Location createLocation(Location location, User user);
    List<Location> getAllLocations();
    Location getLocationById(UUID id);
    void deleteLocation(UUID id);
}
