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
@Table(name = "availableticket")
@EntityListeners(AuditingEntityListener.class)
public class AvailableTicket {
	
	   public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getAvailableId() {
		return availableId;
	}

	public void setAvailableId(String availableId) {
		this.availableId = availableId;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Date getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	@Column(name = "route_id", nullable = false)
	    private int routeId;
        
	    @Id
	    @Column(name = "available_id", nullable = false)
	    private String availableId;
	
	
	    @Column(name = "price", nullable = false)
	    private int Price;
	    
	    @Column(name = "payment_status", nullable = false)
	    private String paymentStatus;
	    
	    @Temporal(TemporalType.DATE)
	    @Column(name = "cancel_time", nullable = false)
	    private Date cancelTime;

}
