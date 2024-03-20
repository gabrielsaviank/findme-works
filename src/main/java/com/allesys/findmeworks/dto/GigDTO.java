package com.allesys.findmeworks.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class GigDTO {
    private UUID userId;
    private String title;
    private String description;
    private String category;
    private boolean inPlace;
    private BigDecimal hourlyRate;

    private String locationId;

    public GigDTO(
        UUID userId,
        String title,
        String description,
        String category,
        boolean inPlace,
        BigDecimal hourlyRate,
        String locationId
    ) {
        this.userId= userId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.inPlace = inPlace;
        this.hourlyRate = hourlyRate;
        this.locationId = locationId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isInPlace() {
        return inPlace;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public UUID getLocationId() {
        return UUID.fromString(locationId);
    }
}
