package model;

public class TaxCalculator {
	// Variables to easy change the parameters
	private final static int zeroTax = 4000;
	private final static int tenTax = 1500;
	private final static int twentyTax = 28000;
	
	//This method calculate the tax according to the salary
	public static int calcTax(double salary) {
		int sal = (int) Math.round(salary);	
		
		if (sal<=zeroTax)
			return 0;
		
		else if (sal<=zeroTax+tenTax)
			return (int) Math.round((sal-zeroTax)*0.1);
		
		else if(sal<=zeroTax+tenTax+twentyTax)
			return (int) Math.round((tenTax*0.1)+(sal-zeroTax-tenTax)*0.2);
		
		else
			return (int) Math.round((tenTax*0.1)+(twentyTax*0.2)+(sal-zeroTax-tenTax-twentyTax)*0.4);
		
	}
		
}
