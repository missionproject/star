package com.vreserve.bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.type.BlobType;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "driverdrives")
@EntityListeners(AuditingEntityListener.class)
public class DriverDrives {
	
 
    @Column(name = "route_id", nullable = false)
    private int routeId;
    
    public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getLicense() {
		return License;
	}

	public void setLicense(String license) {
		License = license;
	}

	public BlobType getPhoto() {
		return Photo;
	}

	public void setPhoto(BlobType photo) {
		Photo = photo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	@Id
    @Column(name = "license", nullable = false)
    private String License;
    
    @Column(name = "photo", nullable = false)
    private BlobType Photo;
    
    
    @Column(name = "name", nullable = false)
    private String Name;
    
    @Column(name = "password", nullable = false)
    private String Password;
    
    @Column(name = "email", nullable = false)
    private String Email;
    
    @Column(name="phone_id",nullable = false)
    private int phoneId;
}
