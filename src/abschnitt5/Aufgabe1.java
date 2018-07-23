package abschnitt5;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Alter?");
		
		Scanner scanAlter = new Scanner(System.in);
		
		int alter = scanAlter.nextInt();
		
		System.out.println("Name");
		
		Scanner scanName = new Scanner(System.in);
		
		String Name = scanName.nextLine();
		
		System.out.println("Alter: " + alter + " Name: " + Name);
		
	}

}
