package com.allesys.findmeworks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private boolean isServiceProvider;
;
    public UUID getId() {
        return id;
    }
    
    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone= phone;
    }

    public boolean getIsServiceProvider() {
        return isServiceProvider;
    }

    public void setIsServiceProvider(boolean isServiceProvider) {
        this.isServiceProvider = isServiceProvider;
    }
}
