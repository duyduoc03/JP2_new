package org.example.backend;

import org.example.entity.*;

import java.sql.*;

public class PlayerDAOImp implements PlayerDAO {
	@Override
	public void addPlayer(Player player) {
		String sql = "INSERT INTO Player (NationalId, PlayerName, HighScore, Level) VALUES (?, ?, ?, ?)";
        try (Connection connection = Connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setInt(1, player.getNationalId());
            preparedStatement.setString(2, player.getPlayerName());
            preparedStatement.setInt(3, player.getHighScore());
            preparedStatement.setInt(4, player.getLevel());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Added player successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	@Override
	public void deletePlayer(int id) {
	    String sql = "DELETE FROM Player WHERE PlayerId = ?";
	    try (Connection connection = Connect.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	        preparedStatement.setInt(1, id);
	        int rowsDeleted = preparedStatement.executeUpdate();
	        if (rowsDeleted > 0) {
				System.out.println("Deleted player successfully!");
	        } else {
				System.out.println("Notfound player id.");
	        }
	    } catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
	    }
	}

	public void displayPlayerInformation() {
		String sql = "SELECT player.*, national.NationalName " +
				"FROM player " +
				"INNER JOIN national ON player.NationalId = national.NationalId";
		try (Connection connection = Connect.getConnection();
			 Statement statement = connection.createStatement();
			 ResultSet resultSet = statement.executeQuery(sql)) {
			System.out.println("+----------+---------------------+------------+-------+----------------+");
			System.out.println("| PlayerId |     Player Name     | High Score | Level |    National    |");
			System.out.println("+----------+---------------------+------------+-------+----------------+");
			while (resultSet.next()) {
				int id = resultSet.getInt("PlayerId");
				String name = resultSet.getString("PlayerName");
				int score = resultSet.getInt("HighScore");
				int level = resultSet.getInt("Level");
				String nationalName = resultSet.getString("National.NationalName");

				System.out.printf("| %-8d | %-19s | %-10d | %-5d | %-14s |\n", id, name, score, level, nationalName);
			}
			System.out.println("+----------+---------------------+------------+-------+----------------+");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void findPlayer(String name) {
		String sql = "SELECT * FROM player WHERE PlayerName LIKE ?";
		try (Connection connection = Connect.getConnection();
			 PreparedStatement statement = connection.prepareStatement(sql)) {

			statement.setString(1, "%" + name + "%");

			try (ResultSet resultSet = statement.executeQuery()) {
				System.out.println("+----------+------------+---------------------+------------+-------+");
				System.out.println("| PlayerId | NationalId |     Player Name     | High Score | Level |");
				System.out.println("+----------+------------+---------------------+------------+-------+");

				boolean found = false;
				while (resultSet.next()) {
					found = true;
					int id = resultSet.getInt("PlayerId");
					int nationalId = resultSet.getInt("NationalId");
					String playerName = resultSet.getString("PlayerName");
					int highScore = resultSet.getInt("HighScore");
					int level = resultSet.getInt("Level");

					System.out.printf("| %-8d | %-10d | %-19s | %-10d | %-5d |\n", id, nationalId, playerName, highScore, level);
				}
				if (!found) {
					System.out.println("|                  No players found matching the name.                  |");
				}
				System.out.println("+----------+------------+---------------------+------------+-------+");
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void displayTop10() {
		String sql = "SELECT player.PlayerId, player.PlayerName, player.HighScore, player.Level, national.NationalName " +
				"FROM player " +
				"INNER JOIN national ON player.NationalId = national.NationalId " +
				"ORDER BY player.HighScore DESC " +
				"LIMIT 10";
		try (Connection connection = Connect.getConnection();
			 Statement statement = connection.createStatement();
			 ResultSet resultSet = statement.executeQuery(sql)) {

			System.out.println("+----------+---------------------+------------+-------+----------------+");
			System.out.println("| PlayerId |     Player Name     | High Score | Level |    National    |");
			System.out.println("+----------+---------------------+------------+-------+----------------+");

			while (resultSet.next()) {
				int id = resultSet.getInt("PlayerId");
				String name = resultSet.getString("PlayerName");
				int score = resultSet.getInt("HighScore");
				int level = resultSet.getInt("Level");
				String nationalName = resultSet.getString("NationalName");

				System.out.printf("| %-8d | %-19s | %-10d | %-5d | %-14s |\n", id, name, score, level, nationalName);
			}
			System.out.println("+----------+---------------------+------------+-------+----------------+");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}




