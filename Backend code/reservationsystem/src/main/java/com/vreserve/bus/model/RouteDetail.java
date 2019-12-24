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
	@Table(name = "routedetail")
	@EntityListeners(AuditingEntityListener.class)
	public class RouteDetail {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long routeid;
	    
	    
	    @Temporal(TemporalType.DATE)
	    @Column(name = "depaturedate", nullable = false)
	    private Date depatureDate;
	    
	    @Column(name = "shift", nullable = false)
	    private String shift;

	    @Column(name = "address", nullable = false)
	    private String address;

	    @Column(name = "landmark", nullable = false)
	    private String landmark;
	    
	    @Column(name = "droppoint", nullable = false)
	    private String dropPoint;
	    
	    @CreationTimestamp
	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "starttime", nullable = false)
	    private Date startTime;
	    
	    @CreationTimestamp
	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "endtime", nullable = false)
	    private Date endTime;

	  

	  /**
	   * Gets id.
	   *
	   * @return the id
	   */
	  public long getId() {
	        return routeid;
	    }

	  /**
	   * Sets id.
	   *
	   * @param id the id
	   */
	  public void setId(long routeid) {
	        this.routeid = routeid;
	    }


	  
	
	  public Date getdepatureDate() {
	        return depatureDate;
	    }

	  /**
	   * Sets created at.
	   *
	   * @param createdAt the created at
	   */
	  public void setdepatureDate(Date depatureDate) {
	        this.depatureDate = depatureDate;
	    }

	  public String getshift() {
	        return shift;
	    }

	  /**
	   * Sets first name.
	   *
	   * @param firstName the first name
	   */
	  public void setshift(String shift) {
	        this.shift = shift;
	    }
	  
	  public String getaddress() {
	        return address;
	    }

	  /**
	   * Sets created by.
	   *
	   * @param createdBy the created by
	   */
	  public void setaddress(String address) {
	        this.address = address;
	    }
	  public String getlandmark() {
	        return landmark;
	    }
	  
	  public void setlandmark(String landmark) {
	        this.landmark = landmark;
	    }

	  /**
	   * Gets updated by.
	   *
	   * @return the updated by
	   */
	  public String dropPoint() {
	        return dropPoint;
	    }

	  /**
	   * Sets updated by.
	   *
	   * @param updatedBy the updated by
	   */
	  public void setdropPoint(String dropPoint) {
	        this.dropPoint = dropPoint;
	    }

	  public Date getstartTime() {
	        return startTime;
	    }

	  /**
	   * Sets updated at.
	   *
	   * @param updatedAt the updated at
	   */
	  public void setstartTime(Date startTime) {
	        this.startTime = startTime;
	    }
	  
	  public Date getendTime() {
	        return endTime;
	    }

	  /**
	   * Sets updated at.
	   *
	   * @param updatedAt the updated at
	   */
	  public void setendTime(Date endTime) {
	        this.endTime = endTime;
	    }

	 

	    @Override
	    public String toString() {
	        return "routedetail{" +
	                "id=" + routeid +
	                ", depaturedate='" + depatureDate + '\'' +
	                ", shift='" + shift + '\'' +
	                ", address='" + address + '\'' +
	                ", landmark=" + landmark +
	                ", droppoint='" + dropPoint + '\'' +
	                ", starttime=" + startTime +
	                ", endtime='" + endTime + '\'' +
	                '}';
	    }

}
