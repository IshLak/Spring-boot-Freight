package com.freightmgmt.freightdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "services")
public class ServicesEntity {
	
	@Id
	@GeneratedValue
	private int serviceid;
	private int userid;
	private String username;
	private String source;
	private String destination;
	private String date;
	private float weightavail;
	private float priceperlb;
	
	public int getServiceid() {
		return serviceid;
	}
	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getWeightavail() {
		return weightavail;
	}
	public void setWeightavail(float weightavail) {
		this.weightavail = weightavail;
	}
	public float getPriceperlb() {
		return priceperlb;
	}
	public void setPriceperlb(float priceperlb) {
		this.priceperlb = priceperlb;
	}
		
}
