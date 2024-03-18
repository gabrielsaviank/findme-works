package com.allesys.findmeworks.service.GigService;

import com.allesys.findmeworks.entity.Gig;
import com.allesys.findmeworks.entity.Location;

import java.util.List;
import java.util.UUID;

public interface GigService {
    Gig createGig(Gig gig, UUID userId);
    List<Gig> getAllGigs();
}
