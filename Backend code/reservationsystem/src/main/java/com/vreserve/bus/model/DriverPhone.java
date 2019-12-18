package com.vreserve.bus.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table (name = "DriverPhone")

public class DriverPhone {
	@Id
	@Column(name="phoneid" , nullable = false)
	private long phoneid;
	
	public long getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(long phoneid) {
		this.phoneid = phoneid;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Column(name="phone_number" , nullable = false)
	private String phonenumber;
	
	@Override
	public String toString() {
		return "DriverPhone{" +
				"phoneid=" + phoneid +
                ", phonenumber='" + phonenumber + '\'' +
                
                '}';
	}
	

}
