package com.allesys.findmeworks.dto;

import java.math.BigDecimal;

public class GigDTO {
    private String title;
    private String description;
    private String category;
    private boolean inPlace;
    private BigDecimal hourlyRate;
    private String locationId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isInPlace() {
        return inPlace;
    }

    public void setInPlace(boolean inPlace) {
        this.inPlace = inPlace;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
}
