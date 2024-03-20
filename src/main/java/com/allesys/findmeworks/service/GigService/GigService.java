package com.allesys.findmeworks.service.GigService;

import com.allesys.findmeworks.dto.GigDTO;
import com.allesys.findmeworks.entity.Gig;

import java.util.List;
import java.util.UUID;

public interface GigService {
    Gig createGig(GigDTO gigRequest);
    List<Gig> getAllGigs();
    void deleteGig(UUID gigId);
    Gig updateGig(UUID gigId, GigDTO gigRequest);
}
