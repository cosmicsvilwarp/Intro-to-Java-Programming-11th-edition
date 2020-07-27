import java.io.*;

/********************************************************************************
 * 											*
 *																				*
 * Listing 10.2: This is the encapsulated class for implementing listing 10.1	*
 ********************************<UML>*******************************************
 *-annualInterestRate : double													*
 *-numberOfYears: int															*
 *-loanAmount: double															*
 *-loanDate: java.util.Date														*
 *------------------------------------------------------------------------------*
 *+Loan()																		*
 *+Loan(annualInterestRate: double, numberOfYears: int, loanAmount: double)		*
 *+getAnnualInterestRate: double												*
 *+getNumberOfYears: int														*
 *+getLoanAmount: double														*
 *+getLoanDate: java.util.Date													*
 *+setAnnualInterestRate(annualInterestRate: double): void						*
 *+setNumberOfYears(numberOfYears: int): void									*
 *+setLoanAmount(loanAmount: double): void										*
 *+getMonthlyPayment(): void													*
 *+getTotalPayment(): void														*
 *																				*
 ********************************************************************************/
public class Loan implements Serializable {
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
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
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
	public void setAnnualInterestRate(double annualInterestRate)throws IllegalArgumentException {
		if(annualInterestRate <= 0)
		throw new IllegalArgumentException("The interest rate cannot be less than zero");
		
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * Return numberOfYears
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if(numberOfYears <= 0)
		throw new IllegalArgumentException("Number of years cannot be less than zero");
		
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
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if(loanAmount <= 0)
		throw new IllegalArgumentException("Loan amount cannot be less than zero");
		
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
	@Override
	public String toString(){
		return "Annual Interest Rate: " + this.getAnnualInterestRate() +
				"\nLoan Amount: " + this.getLoanAmount() +
				"\nNumber of years: " + this.getNumberOfYears();
	}
}