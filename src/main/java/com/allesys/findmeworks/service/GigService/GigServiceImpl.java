package com.allesys.findmeworks.service.GigService;

import com.allesys.findmeworks.entity.Gig;
import com.allesys.findmeworks.entity.Location;
import com.allesys.findmeworks.repository.GigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GigServiceImpl implements GigService {
    private final GigRepository gigRepository;

    @Autowired
    public GigServiceImpl(GigRepository gigRepository) {
        this.gigRepository = gigRepository;
    }

    @Override
    public Gig createGig(Gig gig, UUID userId) {
        gig.setUserId(userId);
//        gig.setLocation(location);

        return this.gigRepository.save(gig);
    }
    @Override
    public List<Gig> getAllGigs() {
        return this.gigRepository.findAll();
    }
}
