package com.hexaware.model;

public class ItemDonation extends Donation {
	
	private String itemType;

	public ItemDonation(String donorName, double amount,String itemType) {
		super(donorName, amount);
		this.itemType = itemType;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	@Override
	public String toString() {
		return "ItemDonation [itemType=" + itemType + "]";
	}
	

}