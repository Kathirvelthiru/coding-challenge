package com.hexaware.model;

public class Donation {
	private String donorName;
    private double amount;
	public Donation(String donorName, double amount) {
		super();
		this.donorName = donorName;
		this.amount = amount;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Donation [donorName=" + donorName + ", amount=" + amount + "]";
	}
    

}