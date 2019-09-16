// package task2;
import java.util.*;

public class Fraction {
    /**
     * declare attributes here
     */
    private int numerator;
    private int denominator;

    /**
     * @return the numerator
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * @return the denominator
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * @param numerator the numerator to set
     */
    public void setNumerator(int _numerator) {
        this.numerator = _numerator;
    }

    /**
     * @param denominator the denominator to set
     */
    public void setDenominator(int _denominator) {
        this.denominator = Math.abs(_denominator);
        this.numerator = this.numerator * (_denominator / this.denominator);
    }

    /**
     * declare constructor here
     */
    Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    Fraction(int _numerator) {
        this.numerator = _numerator;
        this.denominator = 1;
    }

    Fraction(int _numerator, int _denominator) {
        if(_denominator == 0) this.denominator = 1;
        else this.denominator = Math.abs(_denominator);

        this.numerator = _numerator * (_denominator / this.denominator);

        this.reduce();
    }

    /**
     * methods
     */
    public void logFraction() {
        if(this.getDenominator() == 1) 
            System.out.println(this.getNumerator());
        else System.out.println(this.getNumerator() + "/" + this.getDenominator());
    }

    // getGcd
    public int gcd(int a, int b) {
        if(b == 0) return a;

        return gcd(b, a % b);
    }

    // reduce
    public void reduce() {
        int gcd = this.gcd(Math.abs(this.numerator), this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    // add
    public Fraction add(Fraction other) {
        Fraction sum = new Fraction(this.numerator * other.getDenominator() + this.denominator * other.getNumerator(), this.denominator * other.getDenominator());

        return sum;
    }

    // subtract
    public Fraction subtract(Fraction other) {
        Fraction diff = new Fraction(this.numerator * other.getDenominator() - this.denominator * other.getNumerator(), this.denominator * other.getDenominator());

        return diff;
    }

    // multiple
    public Fraction multiple(Fraction other) {
        Fraction area = new Fraction(this.numerator * other.getNumerator(), this.denominator * other.getDenominator());

        return area;
    }

    // divide
    public Fraction divide(Fraction other) {
        Fraction quotient = new Fraction(this.numerator * other.getDenominator(), this.denominator * other.getNumerator());

        return quotient;
    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            // compare this vs other here

            if(this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator());
                return true;
        }

        return false;
    }

    static public void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(-3, -4);
        Fraction f3 = new Fraction(2, -4);
        Fraction f4 = new Fraction(5);
        Fraction f5 = new Fraction(5, -1);
        Fraction f6 = new Fraction(-3, 6);
        Fraction f7 = new Fraction(1, 4);

        f4.logFraction();
        f5.logFraction();
        f4.add(f5).logFraction();
        f2.subtract(f7).logFraction();
        f7.multiple(f2).logFraction();
        f4.divide(f3).logFraction();
        f4.divide(f2).logFraction();

        System.out.println("compare result: " + f3.equals(f4));

    }
}
