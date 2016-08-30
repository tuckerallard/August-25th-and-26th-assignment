package com.weekfourproject;

import java.util.Scanner;

public class MovieTheatre 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String userMenuInput = null;
		boolean menuCorrect = false;
		
		System.out.println("Welcome to the student information program");
		
		do {
			System.out.println("Press 1 to read the database" 
					+ "\nPress 2 to add to the database"
					+ "\nPress 3 to update the movie to the database"
					+ "\nPress 4 to delete a movie from the database");
			
			userMenuInput = sc.nextLine();
			switch (userMenuInput) {
			case "1":
				DAO.readFromDB();
				break;
			case "2":
//				DAO.writeToDB();
				break;
			case "3":
				DAO.readFromDB();
				DAO.modifyToDB();
				DAO.readFromDB();
				break;
			case "4":
				DAO.deleteToDatabase();
				break;

			default:
				System.out.println("You've entered an invalid option");
				menuCorrect = true;
				break;
			}
		} while (menuCorrect);
		
	}

}
