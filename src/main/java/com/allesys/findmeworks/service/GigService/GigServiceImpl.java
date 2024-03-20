package com.allesys.findmeworks.service.GigService;

import com.allesys.findmeworks.dto.GigDTO;
import com.allesys.findmeworks.entity.Gig;
import com.allesys.findmeworks.entity.Location;
import com.allesys.findmeworks.repository.GigRepository;
import com.allesys.findmeworks.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GigServiceImpl implements GigService {
    private final GigRepository gigRepository;
    private final LocationRepository locationRepository;

    @Autowired
    public GigServiceImpl(
        GigRepository gigRepository,
        LocationRepository locationRepository
    ) {
        this.gigRepository = gigRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public Gig createGig(GigDTO gigRequest){
        if (gigRequest.getUserId() == null || gigRequest.getUserId().toString().isEmpty()) {
            throw new IllegalArgumentException("User ID is required");
        }

        if (gigRequest.getTitle() == null || gigRequest.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Title is required");
        }

        if(gigRequest.getLocationId() == null || gigRequest.getLocationId().toString().isEmpty()){
            throw new IllegalArgumentException("Location ID is required");
        }

        Location location = locationRepository.findById(gigRequest.getLocationId())
                .orElseThrow(() -> new IllegalArgumentException("Location not found with ID: " + gigRequest.getLocationId()));

        Gig gig = new Gig();
        gig.setUserId(gigRequest.getUserId());
        gig.setTitle(gigRequest.getTitle());
        gig.setDescription(gigRequest.getDescription());
        gig.setCategory(gigRequest.getCategory());
        gig.setInPlace(gigRequest.isInPlace());
        gig.setHourlyRate(gigRequest.getHourlyRate());
        gig.setLocation(location);
        return gigRepository.save(gig);
    }
    @Override
    public List<Gig> getAllGigs() {
        return this.gigRepository.findAll();
    }
}
