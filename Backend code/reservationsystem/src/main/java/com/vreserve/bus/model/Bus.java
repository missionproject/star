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
@Table(name = "bus")


public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long busId;
	
	@Column(name= "bus_name" , nullable = false)
	private String busName;
	
	@Column(name="passenger_number" , nullable = false)
	private int passengerNumber;
	
	@Column(name="total_seat" , nullable = false)
	private int totalSeat;
	
	@Column(name="bus_type" , nullable = false)
	private String busType;
	
	public long getbusId() {
		return busId;
	}

	public void setbusId(long busId) {
		this.busId = busId;
	}

	public String getbusName() {
		return busName;
	}

	public void setbusName(String busName) {
		busName = busName;
	}

	public int getpassengerNumber() {
		return passengerNumber;
	}

	public void setpassengerNumber(int passengerNumber) {
		passengerNumber = passengerNumber;
	}

	public int gettotalSeat() {
		return totalSeat;
	}

	public void settotalSeat(int totalSeat) {
		totalSeat = totalSeat;
	}

	public String getbusType() {
		return busType;
	}

	public void setbusType(String busType) {
		busType = busType;
	}
	
	@Override
	public String toString(){
		return "Bus{" +
				"busId=" + busId +
                ", busName='" + busName + '\'' +
                ", passengerNumber='" + passengerNumber + '\'' +
                ", totalSeat='" + totalSeat + '\'' +
                ", busType=" + busType + '\'' +
                '}';
	}

	
	
	
}
