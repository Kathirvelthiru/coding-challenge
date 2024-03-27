package com.hexaware.model;

import java.util.ArrayList;
import java.util.List;

public class PetShelter {
	
	private List<Pet> availablePets;
	public PetShelter() {
		super();
        this.availablePets = new ArrayList<>();
        
	}

	public List<Pet> getAvailablePets() {
		return availablePets;
	}

	public void setAvailablePets(List<Pet> availablePets) {
		this.availablePets = availablePets;
	}

	@Override
	public String toString() {
		return "PetShelter [availablePets=" + availablePets + "]";
	}
	

}