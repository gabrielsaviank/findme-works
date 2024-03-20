package com.allesys.findmeworks.dto;

import java.util.UUID;

public class LocationDTO {
    private UUID userId;
    private UUID locationId;
    private String locationName;
    private String latitude;
    private String longitude;

    public LocationDTO(
        UUID userId,
        UUID locationId,
        String locationName,
        String latitude,
        String longitude
    ) {
        this.userId = userId;
        this.locationId = locationId;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getLocationId() {
        return locationId;
    }

    public void setLocationId(UUID locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
