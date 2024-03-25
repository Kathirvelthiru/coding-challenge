package main;

import java.sql.SQLException;
import java.util.Scanner;

import dao.PetDAO;
import entity.model.Pet;

public class MainModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("PetPals Menu:");
            System.out.println("1. Add a pet");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPet();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 2);

        scanner.close();
    }

    private static void addPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter pet breed: ");
        String breed = scanner.nextLine();

        Pet pet = new Pet(name, age, breed);
        String connectionString = "jdbc:mysql://localhost:3306/PetPals";
        PetDAO petDAO = new PetDAO();

        try {
            petDAO.addPet(pet, connectionString);
            System.out.println("Pet added successfully.");
        } catch (SQLException e) {
            e.printStackTrace(); 
            }
    }
}
