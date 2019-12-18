package com.vreserve.bus.model;

import javax.persistence.Column;

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
@Table (name = "Customer_Phone")


public class CustomerPhone {
	@Id
	@Column(name="phoneid" , nullable = false)
	private long phoneid;
	
	@Column(name="phone_number" , nullable = false)
	private String phonenumber;
	
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
	
	@Override
	public String toString() {
		return "CustomerPhone{" +
				"phoneid=" + phoneid +
                ", phonenumber='" + phonenumber + '\'' +
                
                '}';
	}

}
