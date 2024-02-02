package model;

public class Employee {
	private String name;
	private double income;
	
	// Method that validates and set the string name
	public void setName(String name){
		// check if the input received is either null or empty the message is printed and the program ends
		if (name==null || name=="") {
			System.out.println("You must enter a valid name. Program ended");
			System.exit(0);
		}
		this.name = name;
	}
	
	// Method that validates and set the Income. 
	// Important to note that the income get in as a String and during its validation is converted to Double
	public void setIncome(String income){
		double salary = 0;
		
		// a try catch clause for parsing String to double. In case of a non numeric String end the program.
		try {
			salary = Double.parseDouble(income);
		}catch(Exception e) {
			System.out.println("You must enter a valid income. Program ended");
			System.exit(0);
		}
		
		// check if the salary is numeric but not > 0.
		if (salary<=0) {
			System.out.println("You must enter a valid income greater tha 0. Program ended");
			System.exit(0);
		}
		
		this.income = salary;
	}

	public double getIncome() {
		return income;
	}
	
	
}
