package com.allesys.findmeworks.service.LocationService;

import java.util.List;
import java.util.UUID;

import com.allesys.findmeworks.dto.LocationDTO;
import com.allesys.findmeworks.entity.Location;

public interface LocationService {
    Location createLocation(LocationDTO locationRequest);
    List<Location> getAllLocations();
    Location getLocationById(UUID id);
    void deleteLocation(UUID id);
}
