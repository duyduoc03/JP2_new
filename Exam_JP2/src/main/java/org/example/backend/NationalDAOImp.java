package org.example.backend;

import org.example.entity.Connect;
import org.example.entity.National;

import java.sql.*;

public class NationalDAOImp implements NationalDAO {

	@Override
	public void addNational(National national) {
		String sql = "INSERT INTO National (NationalName) VALUES (?)";
        try (Connection connection = Connect.getConnection();
			 PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, national.getNationalName());
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Added national successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

	@Override
	public void deleteNational(int id) {
	    String sql = "DELETE FROM National WHERE NationalId = ?";
	    try (Connection connection = Connect.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	        preparedStatement.setInt(1, id);
	        int rowsDeleted = preparedStatement.executeUpdate();
	        if (rowsDeleted > 0) {
	            System.out.println("Deleted national successfully!");
	        } else {
	            System.out.println("Notfound national id.");
	        }
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}


}




