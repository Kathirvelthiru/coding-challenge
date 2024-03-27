package com.hexaware.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.exception.InvalidPetAgeException;
import com.hexaware.model.AdoptionEventt;
import com.hexaware.model.Donation;
import com.hexaware.model.ItemDonation;
import com.hexaware.model.Pet;
import com.hexaware.util.DBUtil;

public class PetShelterDao {
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	public void addPet(Pet pet) throws InvalidPetAgeException, SQLException {
		con = DBUtil.getDBConn();
        String query = "INSERT INTO pet (name, age, breed) VALUES (?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setString(1, pet.getName());
            statement.setInt(2, pet.getAge());
            statement.setString(3, pet.getBreed());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new pet was added to the shelter!");
            }
        }
    }
	public void removePet(String name) throws SQLException {
		con = DBUtil.getDBConn();
        String query = "DELETE FROM pet WHERE name = ?";
        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setString(1, name);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("The pet was removed from the shelter!");
            }
        }
    }
	public List<Pet> listAvailablePets() throws SQLException {
		con = DBUtil.getDBConn();
        List<Pet> availablePets = new ArrayList<>();
        String query = "SELECT * FROM pet ";
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Pet pet = new Pet(resultSet.getString("name"), resultSet.getInt("age"), resultSet.getString("breed"));
                pet.setName(resultSet.getString("name"));
                pet.setAge(resultSet.getInt("age"));
                pet.setBreed(resultSet.getString("breed"));
                availablePets.add(pet);
            }
        }
        return availablePets;
    }
	public void recordDonation(Donation donation) throws SQLException {
	    con = DBUtil.getDBConn();
	    String query = "INSERT INTO donation (DonorName, amount) VALUES (?, ?)";
	    try (PreparedStatement statement = con.prepareStatement(query)) {
	        statement.setString(1, donation.getDonorName());
	        statement.setDouble(2, donation.getAmount());
	        int rowsInserted = statement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("Donation recorded successfully!");
	        }
	    }
	}
	public void recordItemDonation(ItemDonation itemDonation) throws SQLException {
        con = DBUtil.getDBConn();
        String query = "INSERT INTO ItemDonation (DonorName, amount, itemType) VALUES (?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setString(1, itemDonation.getDonorName());
            statement.setDouble(2, itemDonation.getAmount());
            statement.setString(3, itemDonation.getItemType());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Item donation recorded successfully!");
            }
        }
    }
	public void adoptEvent(AdoptionEventt event) throws SQLException {
        con = DBUtil.getDBConn();
        String query = "INSERT INTO AdoptionEventt (eventid, eventname, evendate,eveloc) VALUES (?,?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(query)) {
        	
            statement.setString(1, event.getEvename());
            statement.setDate(2, event.getEvendate());
            statement.setString(3, event.getEveloc());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Adoption event added successfully!");
            }
        }
    }


}