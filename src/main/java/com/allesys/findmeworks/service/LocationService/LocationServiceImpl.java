package com.allesys.findmeworks.service.LocationService;

import java.util.List;
import java.util.UUID;

import com.allesys.findmeworks.dto.LocationDTO;
import com.allesys.findmeworks.entity.User;
import com.allesys.findmeworks.repository.GigRepository;
import com.allesys.findmeworks.repository.UserRepository;
import com.allesys.findmeworks.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allesys.findmeworks.entity.Location;
import com.allesys.findmeworks.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;
    private final GigRepository gigRepository;
    private final UserService userService;

    @Autowired
    public LocationServiceImpl(
            LocationRepository locationRepository,
            GigRepository gigRepository,
            UserService userService
    ) {
        this.locationRepository = locationRepository;
        this.gigRepository = gigRepository;
        this.userService = userService;
    }

    @Override
    public Location createLocation(LocationDTO locationRequest){
        Location location = new Location();
        location.setUserId(locationRequest.getUserId());
        location.setLocationName(locationRequest.getLocationName());
        location.setLatitude(locationRequest.getLatitude());
        location.setLongitude(locationRequest.getLongitude());

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
        Location location = this.locationRepository.findById(id).orElse(null);

        if (location != null) {
            UUID userId = location.getUserId();

            userService.removeLocationFromUser(userId, id);


            this.locationRepository.deleteById(id);
        }
    }

}
