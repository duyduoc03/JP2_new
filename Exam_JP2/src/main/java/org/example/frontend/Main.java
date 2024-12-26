package org.example.frontend;

import org.example.backend.NationalDAOImp;
import org.example.backend.PlayerDAOImp;
import org.example.entity.National;
import org.example.entity.Player;

import java.util.Scanner;

public class Main {
	private static NationalDAOImp nationalDao = new NationalDAOImp();
    private static PlayerDAOImp playerDao = new PlayerDAOImp();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. National Management");
            System.out.println("2. Player Management");
            System.out.println("3. Show all players");
            System.out.println("4. Find player by name");
            System.out.println("5. Show top 10 players where having the most high score.");
            System.out.println("0. Exit");
            System.out.print("Please select the menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    national_management(scanner);
                    break;
                case 2:
                    player_management(scanner);
                    break;
                case 3:
                	showPlayerInformation();
                    break;
                case 4:
                    findPlayer(scanner);
                    break;
                case 5:
                    displayTop10();
                    break;
                case 0:
                    System.out.println("Exit the program.");
                    break;
                default:
                    System.out.println("Invalid selection!");
            }
        } while (choice != 0);
        scanner.close();
    }
	private static void national_management(Scanner scanner) {
        System.out.println("1. Add a new national");
        System.out.println("2. Delete a national");
        System.out.print("Select function: ");
        int type = scanner.nextInt();
        scanner.nextLine();

        if (type == 1) {
            System.out.print("Enter national name: ");
            String name = scanner.nextLine();
            National national = new National(name);
            nationalDao.addNational(national);
        } else if (type == 2) {
            System.out.print("Enter National Id you want to delete: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            nationalDao.deleteNational(id);
        } else {
            System.out.println("Invalid selection!");
        }
    }

    private static void player_management(Scanner scanner) {
        System.out.println("1. Add a new player");
        System.out.println("2. Delete a player");
        System.out.print("Select function: ");
        int type = scanner.nextInt();
        scanner.nextLine();

        if (type == 1) {
            System.out.print("Enter national Id: ");
            int nationalId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter player name: ");
            String name = scanner.nextLine();
            System.out.print("Enter player score: ");
            int score = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter player level: ");
            int level = scanner.nextInt();
            scanner.nextLine();
            Player player = new Player(nationalId, name, score, level);
            playerDao.addPlayer(player);
        } else if (type == 2) {
            System.out.print("Enter Player Id you want to delete: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            playerDao.deletePlayer(id);
        } else {
            System.out.println("Invalid selection!");
        }
    }

	private static void showPlayerInformation() {
        System.out.print("All Player: \n");
		playerDao.displayPlayerInformation();
	}
	
	private static void findPlayer(Scanner scanner) {
        System.out.print("Enter Player name need find: ");
        String name = scanner.nextLine();
        playerDao.findPlayer(name);
    }

    private static void displayTop10() {
        System.out.print("Top 10 players the most high score: \n");
        playerDao.displayTop10();
    }

}
