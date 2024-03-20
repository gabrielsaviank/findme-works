package com.allesys.findmeworks.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "gigs")
public class Gig {
    @Id
    @GeneratedValue
    private UUID id;
    private UUID userId;
    private String title;
    private String description;
    private String category;
    private boolean inPlace;
    private BigDecimal hourlyRate;
    private BigDecimal servicePrice;

    @ManyToOne
    private Location location;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
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

    public BigDecimal getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(BigDecimal servicePrice) {
        this.servicePrice = servicePrice;
    }
}
