
import java.math.*;

class NewRational extends Number implements Comparable {
  // Data fields for numerator and denominator
  private BigInteger[] r = new BigInteger[2];

  /** Construct a ratinoal with default properties */
  public NewRational() {
    this(new BigInteger("0"), new BigInteger("1"));
  }

  /** Construct a NewRational with specifiec numerator and denominator */
  public NewRational(BigInteger numerator, BigInteger denominator) {
    BigInteger gcd = gcd(numerator, denominator);
    r[0] = (denominator.compareTo(BigInteger.ZERO) > 0
      ? BigInteger.ONE : 
      new BigInteger("-1")).multiply(numerator.divide(gcd));
    r[1] = denominator.divide(gcd);
  }

  /** Find GCD of two numbers */
  private static BigInteger gcd(BigInteger n, BigInteger d) {
    BigInteger n1 = n;
    BigInteger n2 = d;
    BigInteger gcd = BigInteger.ONE;

    for (BigInteger k = BigInteger.ONE; 
      k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; 
      k = k.add(BigInteger.ONE)) {
      if (n1.remainder(k).compareTo(BigInteger.ZERO) == 0 && 
        n2.remainder(k).compareTo(BigInteger.ZERO) == 0)
        gcd = k;
    }

    return gcd;
  }

  /** Return numerator */
  public BigInteger getNumerator() {
    return r[0];
  }

  /** Return denominator */
  public BigInteger getDenominator() {
    return r[1];
  }

  /** Add a NewRational number to this NewRational */
  public NewRational add(NewRational secondNewRational) {
    BigInteger n = (r[0].multiply(secondNewRational.getDenominator())).add(
      r[1].multiply(secondNewRational.getNumerator()));
    BigInteger d = r[1].multiply(secondNewRational.getDenominator());
    return new NewRational(n, d);
  }

  /** Subtract a NewRational number from this NewRational */
  public NewRational subtract(NewRational secondNewRational) {
    BigInteger n = (r[0].multiply(secondNewRational.getDenominator())).subtract(
      r[1].multiply(secondNewRational.getNumerator()));
    BigInteger d = r[1].multiply(secondNewRational.getDenominator());
    return new NewRational(n, d);
  }

  /** Mulitply a NewRational number by this NewRational */
  public NewRational multiply(NewRational secondNewRational) {
    BigInteger n = r[0].multiply(secondNewRational.getNumerator());
    BigInteger d = r[1].multiply(secondNewRational.getDenominator());
    return new NewRational(n, d);
  }

  /** Divide a NewRational number by this NewRational */
  public NewRational divide(NewRational secondNewRational) {
    BigInteger n = r[0].multiply(secondNewRational.getDenominator());
    BigInteger d = r[1].multiply(secondNewRational.getNumerator());
    return new NewRational(n, d);
  }

  @Override
  public String toString() {
    if (r[1].compareTo(BigInteger.ONE) == 0)
      return r[0] + "";
    else
      return r[0] + "/" + r[1];
  }

  @Override // Override the equals method in the Object class
  public boolean equals(Object other) {
    if (((this.subtract((NewRational)(other))).getNumerator()).compareTo(
      BigInteger.ZERO) == 0)
      return true;
    else
      return false;
  }

  @Override // Implement the abstract intValue method in Number
  public int intValue() {
    return (int)doubleValue();
  }

  @Override // Implement the abstract floatValue method in Number
  public float floatValue() {
    return (float)doubleValue();
  }

  @Override // Implement the doubleValue method in Number
  public double doubleValue() {
    return this.getNumerator().doubleValue() / 
      this.getDenominator().doubleValue();
  }

  @Override // Implement the abstract longValue method in Number
  public long longValue() {
    return (long)doubleValue();
  }

  @Override
  public int compareTo(Object o) {
    BigInteger zero = BigInteger.ZERO;
    BigInteger n = this.subtract((NewRational)o).getNumerator();
    if (n.compareTo(zero) > 0)
      return 1;
    else if (n.compareTo(zero) < 0)
      return -1;
    else
      return 0;
  }
}