package com.hexaware.controller;

import com.hexaware.model.Pet;

public interface AInterface {
	public void addPet(Pet pet);
	public void removePet(Pet pet);
	public void listAvailablePets();
	public abstract void recordDonation();
	public void recordItemDonation();
	

}