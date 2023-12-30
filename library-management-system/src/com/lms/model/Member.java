package com.lms.model;

import java.util.Date;

public class Member extends Account {
	
	private Date dateOfMembership;
	private int totalBooksCheckedout;
	
	public Date getDateOfMembership() {
		return dateOfMembership;
	}
	public void setDateOfMembership(Date dateOfMembership) {
		this.dateOfMembership = dateOfMembership;
	}
	public int getTotalBooksCheckedout() {
		return totalBooksCheckedout;
	}
	public void setTotalBooksCheckedout(int totalBooksCheckedout) {
		this.totalBooksCheckedout = totalBooksCheckedout;
	}
}
