package com.vreserve.bus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "booking")
@EntityListeners(AuditingEntityListener.class)
public class Booking {
	
	
	    public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public Date getDate() {
		return Date;
	}


	public void setDate(Date date) {
		Date = date;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}


	public Date getCancelTime() {
		return cancelTime;
	}


	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}


		@Column(name = "customer_id", nullable = false)
	    private int customerId;
	
	    @Id
	    @Column(name = "book_id", nullable = false)
	    private int bookId;
	 
	    
	    @Temporal(TemporalType.DATE)
	    @Column(name = "date", nullable = false)
	    private Date Date;
	    
	    @Column(name = "price", nullable = false)
	    private int Price;
	    
	  
	    @Temporal(TemporalType.DATE)
	    @Column(name = "cancel_time", nullable = false)
	    private Date cancelTime;
	   

}

