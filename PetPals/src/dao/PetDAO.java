package dao;

import entity.model.Pet;
import util.DBConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PetDAO {
    private static final String INSERT_PET_QUERY = "INSERT INTO pets (name, age, breed) VALUES (?, ?, ?)";

    public void addPet(Pet pet, String connectionString) throws SQLException {
        try (Connection connection = DBConnUtil.getConnection(connectionString);
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PET_QUERY)) {
            preparedStatement.setString(1, pet.getName());
            preparedStatement.setInt(2, pet.getAge());
            preparedStatement.setString(3, pet.getBreed());
            preparedStatement.executeUpdate();
        }
    }
}
