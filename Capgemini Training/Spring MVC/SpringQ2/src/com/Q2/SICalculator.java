package com.Q2;

import java.security.Principal;

public class SICalculator {
	private int principalAmount;
	private int year;
	private int ROI;
	
	public int getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(int principalAmount) {
		this.principalAmount = principalAmount;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getROI() {
		return ROI;
	}
	public void setROI(int rOI) {
		ROI = rOI;
	}
	
	
	public double ROICal() {
		return  (getPrincipalAmount()*getROI()*getYear())/100;
	}
	

}
