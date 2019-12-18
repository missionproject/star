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
@Table(name = "ticket")


public class Ticket {
	@Id
	@Column(name="ticket_id" , nullable= false )
	private long ticketid;
	
	@Column(name="price" , nullable = false)
	private String price;
	
	@Column(name="payment_status" , nullable = false)
	private String paymentstatus;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cancel_time" , nullable = true)
	private Date canceltime;
	
	@Id
	@Column(name="customer_id" , nullable= false)
	private long customerid;
	
	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}

	public long getTicketid() {
		return ticketid;
	}

	public void setTicketid(long ticketid) {
		this.ticketid = ticketid;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public Date getCanceltime() {
		return canceltime;
	}

	public void setCanceltime(Date canceltime) {
		this.canceltime = canceltime;
	}
	
	@Override
	public String toString(){
		return "Ticket{" +
				"ticketid=" + ticketid +
                ", price='" + price + '\'' +
                ", paymentstatus='" + paymentstatus + '\'' +
                ", canceltime='" + canceltime + '\'' +
                ", customerid='" + customerid + '\''+
                '}';
	}

	

	
}
