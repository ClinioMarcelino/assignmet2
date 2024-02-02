package control;

import java.util.Scanner;
import model.Employee;
import model.TaxCalculator;

/*
 * Developer: Clinio Marcelino de Freitas
 * 
 * Lewis University
 * Class: Object-Oriented Programming
 * 
 * Program for calculating income taxes in a country called Java Land using J$
 * J$ stands for Javean Dollars
 * 
 */
 

public class CtrlProgram {

	public static void main(String[] args){
		
		//Initiating the Scanner
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// Creating an object of the Employee
		Employee emp = new Employee();
		
		System.out.print("Input your full name: ");
		//Read the input from the user and send directly to the object to validate and store
		emp.setName(sc.nextLine()); 
		
		System.out.print("Input your income: J$ ");
		//Read the input from the user and send directly to the object to validate and store
		emp.setIncome(sc.nextLine());
		
		//In this print the calcTax method is a static method from the class TaxCalculator
		// It is getting the employee income and doing the math needed
		System.out.println("Income Tax: J$ "+TaxCalculator.calcTax(emp.getIncome()));
			
	}

}
