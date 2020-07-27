/************************************************************
 * 						*
 * Listing 10.4												*
 * 															*
 * =========================<UML>=========================	*
 * -name: String											*
 * -age: int												*
 * -weight: double											*
 * -height: double											*
 * +KILOGRAMS_PER_POUND: double								*
 * ----------------------------								*
 * +METERS_PER_INCH: double									*
 * ----------------------------								*
 * ======================================================	*
 * +BMI(name: String, age: int, weight: double,				*
 * height: double)											*
 * +BMI(name: String, weight: double, height: double)		*
 * +getBMI(): double										*
 * +getStatus(): String										*
 * +getName(): String										*
 * +getWeight(): String										*
 * +getHeight(): String										*
 ************************************************************/
public class BMI {
	
	// 1. Data field
	private String name;
	private int age;
	private double weight; // in pounds
	private double height; // in inches
	
	// (1) Below are static variable, so they are not tied to specific instances.
	// (2) The aim of using static method is when it is needed to share value 
	// among instances.
	// (3) final means constant, so it cannot be changed.
	// (4) The aim of setting these constants is to convert pound and
	// inch to kilogram and meter
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0253;

	// 2. Methods
	
	// 1st. constructor with name, age, weight, height
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	// 2ed. constructor with name, weight, height and default age
	// This is also used when not knowing age
	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height); // default age 20
	}
	public BMI(String name, int age, double weight, double feet,
			double inches) {
			this(name, age, weight, inches + feet * 12);
		}
		

	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND /
				((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return Math.round((bmi * 100) / 100.0);
	}

	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		else if(bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "Obese";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
}