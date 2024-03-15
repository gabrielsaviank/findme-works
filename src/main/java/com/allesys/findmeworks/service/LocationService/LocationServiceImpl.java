package com.allesys.findmeworks.service.LocationService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allesys.findmeworks.entity.Location;
import com.allesys.findmeworks.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    @Override
    public Location createLocation(Location location, UUID userId) {
        return this.locationRepository.save(location);
    }

    @Override
    public List<Location> getAllLocations() {
        return this.locationRepository.findAll();
    }

    @Override
    public Location getLocationById(UUID id) {
        return this.locationRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteLocation(UUID id) {
        this.locationRepository.deleteById(id);
    }

}
