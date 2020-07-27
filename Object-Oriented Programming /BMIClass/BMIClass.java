/*Sebas*/
import java.util.*;
/**
 * 
 * Listing 10.3(refer to Listing 10.4 "BMI" class)
 */
//Exercice Chapter 10 E #1
//** Construct a BMI with the specified name, age, weight,
		//* feet, and inches
		//*/
public class BMIClass {
	public static void main(String[] args) {
		BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
		System.out.println("The BMI for " + bmi1.getName() + " is "
				+ bmi1.getBMI() + " " + bmi1.getStatus());

		// Make object2 without age. By default, age is set as 20.
		BMI bmi2 = new BMI("Susan King", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is "
				+ bmi2.getBMI() + " " + bmi2.getStatus()
				+ " supposing default age is 20");
				
		BMI bmi3 = new BMI("Sebastien St Vil", 25, 175, 5, 10);
		System.out.println("The BMI for " + bmi3.getName() + " is "
				+ bmi3.getBMI() + " " + bmi3.getStatus()
				+ " supposing default age is 20");
	}
}