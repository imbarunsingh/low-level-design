package com.lms.model;

import java.util.Date;

public class Fine {
	
	private Date creationDate;
	private double bookItemBarcode;
	private String memberId;
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public double getBookItemBarcode() {
		return bookItemBarcode;
	}
	public void setBookItemBarcode(double bookItemBarcode) {
		this.bookItemBarcode = bookItemBarcode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}	

}
