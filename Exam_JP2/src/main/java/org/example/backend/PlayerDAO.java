package org.example.backend;

import org.example.entity.Player;

public interface PlayerDAO {
	public void addPlayer(Player player);
	public void deletePlayer(int id);
	public void displayPlayerInformation();
	public void findPlayer(String name);
	public void displayTop10();
}
