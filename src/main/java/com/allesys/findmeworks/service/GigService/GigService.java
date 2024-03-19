package com.allesys.findmeworks.service.GigService;

import com.allesys.findmeworks.entity.Gig;

import java.util.List;
import java.util.UUID;

public interface GigService {
    Gig createGig(Gig gig, UUID userId, UUID locationId);
    List<Gig> getAllGigs();
}
