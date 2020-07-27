/*Sebas*/
/*********************************************************************************
* (Use ArrayList) Write a program that creates an ArrayList and adds a Loan      *
* object, a Date object, a string, and a Circle object to the list, and use a    *
* loop to display all the elements in the list by invoking the object’s          *
* toString() method.                                                             *
*********************************************************************************/
import java.util.ArrayList;
import java.util.Date;

class ArrayListC11E6 {
	// Main method
	public static void main(String[] args) {
		// Create an array list of objects
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(new Loan());		
		o.add(new Date());		
		o.add(new String("String class"));	
		o.add(new Circle());	

		// Display all the elements in the list by 
		// invoking the object’s toString() method
		for (int i = 0; i < o.size(); i++) {
			System.out.println((o.get(i)).toString());
		}
	}
}



/////////////////////////Loan and Circle classes are below////////////////////////////////////////////////////










class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	Loan() {
		this(2.5, 1, 1000);
	}

	/**Construct a loan with specified annual interest rate,
	 * number of years, and loan amount */
	Loan(double annualInterestRate, int numberOfYears,
				double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/**
	 * Return annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * Set a new annualInterestRate
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * Return numberOfYears
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/**
	 * Return loanAmount
	 */
	public double getLoanAmount() {
		return loanAmount;
	}

	/**
	 * Set a new loanAmount
	 */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * Calculate monthly payment
	 */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/**
	 * Calculate total payment
	 */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/**
	 * Return loan date
	 * It is not immutable. Because it use setTime() method to modify it.
	 */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}

class Circle2 {
	/** The radius of the circle */
	double radius;

	/** The number of the objects created */
	static int numberOfObjects = 0;

	/** Construct a circle with radius 1 */
	Circle2() {
		radius = 1.0;
		numberOfObjects++;
	}

	/** Construct a circle with a specified radius */
	Circle2(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return numberOfObjects */
	static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}
}