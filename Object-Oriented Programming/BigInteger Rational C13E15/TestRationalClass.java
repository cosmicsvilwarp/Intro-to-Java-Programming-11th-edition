import java.math.*;

class TestNewRationalClass {
  /** Main method */
  public static void main(String[] args) {
    // Create and initialize two NewRational numbers r1 and r2
    NewRational r1 = new NewRational(new BigInteger("40000000"), 
      new BigInteger("200000"));
    NewRational r2 = new NewRational(new BigInteger("200000"), 
      new BigInteger("300000"));
      


    // Display results
    System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
    System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
    System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
    System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
    System.out.println(r2 + " is " + r2.doubleValue());
  }
}