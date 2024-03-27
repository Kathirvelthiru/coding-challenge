package com.hexaware.main;
import java.sql.SQLException;


import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.PetShelterDao;
import com.hexaware.exception.InvalidPetAgeException;
import com.hexaware.exception.InvalidPetAgeException;
import com.hexaware.model.Donation;
import com.hexaware.model.ItemDonation;
import com.hexaware.model.Pet;
import com.hexaware.model.AdoptionEventt;

public class MainMethod {
    public static void main(String[] args) throws SQLException, InvalidPetAgeException {
        Scanner scanner = new Scanner(System.in);
        PetShelterDao shelterDAO = new PetShelterDao();
       

        int choice = 0; 

        do {
            System.out.println("Pet Adoption Platform Menu:");
            System.out.println("1. Add a Pet");
            System.out.println("2. Remove a Pet");
            System.out.println("3. List Available Pets");
            System.out.println("4. Record Cash Donation");
            System.out.println("5. Record Item Donation");
            
            
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter pet details:");
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Age: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Breed: ");
                        String breed = scanner.nextLine();

                        
                        Pet pet = new Pet(name, age, breed);

                       
                        shelterDAO.addPet(pet);
                        System.out.println("Pet added successfully!");
                        break;

                        

                    case 2:
                 
                        System.out.println("Enter the name of the pet to remove:");
                        String petNameToRemove = scanner.nextLine();

                        // Call a method from PetShelterDao to remove the specified pet
                        shelterDAO.removePet(petNameToRemove);
                        
                        System.out.println("Pet '" + petNameToRemove + "' has been removed.");
                        break;

                        

                       
                    case 3:
                    
                        List<Pet> availablePets = shelterDAO.listAvailablePets();

                        if (availablePets.isEmpty()) {
                            System.out.println("No pets are currently available for adoption.");
                        } else {
                            System.out.println("Available Pets:");
                            for (Pet pet1 : availablePets) {
                                System.out.println("Name: " + pet1.getName() + ", Age: " + pet1.getAge() + ", Breed: " + pet1.getBreed());
                            }
                        }
                        break;

                       
                    case 4:
                        System.out.print("Enter the donor's name: ");
                        String donorName = scanner.nextLine();
                        System.out.print("Enter the amount of cash donation: $");
                        double cashDonationAmount = Double.parseDouble(scanner.nextLine());

                        
                        Donation cashDonation = new Donation(donorName, cashDonationAmount);

                        try {
                            
                            shelterDAO.recordDonation(cashDonation);
                            System.out.println("Cash donation recorded successfully!");
                        } catch (SQLException e) {
                            System.out.println("Error recording cash donation: " + e.getMessage());
                        }
                        break;

                    case 5:
                        System.out.print("Enter the donor's name: ");
                        String donorName1 = scanner.nextLine();
                        
                        System.out.print("Enter the quantity donated: ");
                        int amount = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter the donated item name: ");
                        String itemType = scanner.nextLine();

                        
                        ItemDonation itemDonation = new ItemDonation(donorName1,amount, itemType);

                        try {
                            
                            shelterDAO.recordItemDonation(itemDonation);
                        } catch (SQLException e) {
                            System.out.println("Error recording item donation: " + e.getMessage());
                        }
                        break;
                    
                    	

                        
                      
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
            }
        } while (choice != 6);

        scanner.close();
    }
}