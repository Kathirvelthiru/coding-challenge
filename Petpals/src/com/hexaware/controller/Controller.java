package com.hexaware.controller;

import java.util.ArrayList;

import java.util.List;

import com.hexaware.model.Pet;

public class Controller implements AInterface  {
	private List<Pet> availablePets;
	public Controller() {
        availablePets = new ArrayList<>();
    }

	
	public void addPet(Pet pet) {
		// TODO Auto-generated method stub
	        availablePets.add(pet);
	        System.out.println("Pet added to the list of available pets: " + pet.toString());
	    }

	
	public void removePet(Pet pet) {
		// TODO Auto-generated method stub
		availablePets.remove(pet);
        System.out.println("Pet removed from the list of available pets: " + pet.toString());
    }
	

	
	public void listAvailablePets() {
		// TODO Auto-generated method stub
		
		if (availablePets.isEmpty()) {
            System.out.println("No pets available for adoption.");
        } else {
            System.out.println("Available pets:");
            for (Pet pet : availablePets) {
                System.out.println(pet);
            }
        }
		
	}

	@Override
	public void recordDonation() {
		// TODO Auto-generated method stub
		
		
	}
	public void recordItemDonation() {
		
	}
	public void adoptevent() {
		
	}


	
	

}