package com.allesys.findmeworks.service.GigService;

import com.allesys.findmeworks.entity.Gig;
import com.allesys.findmeworks.entity.Location;
import com.allesys.findmeworks.repository.GigRepository;
import com.allesys.findmeworks.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GigServiceImpl implements GigService {
    private final GigRepository gigRepository;
    private final LocationRepository locationRepository;

    @Autowired
    public GigServiceImpl(GigRepository gigRepository, LocationRepository locationRepository) {
        this.gigRepository = gigRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public Gig createGig(Gig gig, UUID userId, UUID locationId) {
        gig.setUserId(userId);

        Location location = locationRepository.findById(locationId)
                .orElseThrow(() -> new IllegalArgumentException("Location not found with ID: " + locationId));

        gig.setLocation(location);

        return gigRepository.save(gig);
    }
    @Override
    public List<Gig> getAllGigs() {
        return this.gigRepository.findAll();
    }
}
