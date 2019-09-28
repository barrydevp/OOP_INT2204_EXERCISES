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
        if(_numerator == 0) this.denominator = 1;
        this.numerator = _numerator;
    }

    /**
     * @param denominator the denominator to set
     */
    public void setDenominator(int _denominator) {
        if(_denominator != 0) {
            this.denominator = Math.abs(_denominator);
            this.numerator = this.numerator * (_denominator / this.denominator);
        }
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
        if(_denominator == 0) {
            this.denominator = 1;
            _denominator = 1;
        }
        else this.denominator = Math.abs(_denominator);

        this.numerator = _numerator * (_denominator / this.denominator);

        // this.reduce();
    }

    Fraction(Fraction other) {
        this.numerator = other.getNumerator();
        this.denominator = other.getDenominator();
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
    public static int gcd(int a, int b) {
        if(b == 0) return a;

        return gcd(b, a % b);
    }

    // reduce
    public Fraction reduce() {
        int gcd = Fraction.gcd(Math.abs(this.numerator), Math.abs(this.denominator));
        int _numerator = this.numerator / gcd;
        int _denominator = this.denominator / gcd;

        this.denominator = Math.abs(_denominator);
        this.numerator = _numerator * _denominator / this.denominator;

        return this;
    }

    // add
    public Fraction add(Fraction other) {
        Fraction sum = new Fraction(this.numerator * other.getDenominator() + this.denominator * other.getNumerator(), this.denominator * other.getDenominator());

        this.numerator = sum.getNumerator();
        this.denominator = sum.getDenominator();

        return this;
    }

    // subtract
    public Fraction subtract(Fraction other) {
        Fraction diff = new Fraction(this.numerator * other.getDenominator() - this.denominator * other.getNumerator(), this.denominator * other.getDenominator());

        this.numerator = diff.getNumerator();
        this.denominator = diff.getDenominator();

        return this;
    }

    // multiple
    public Fraction multiply(Fraction other) {
        Fraction area = new Fraction(this.numerator * other.getNumerator(), this.denominator * other.getDenominator());

        this.numerator = area.getNumerator();
        this.denominator = area.getDenominator();

        return this;
    }

    // divide
    public Fraction divide(Fraction other) {
        if(other.getNumerator() != 0){
            Fraction quotient = new Fraction(this.numerator * other.getDenominator(),
                this.denominator * other.getNumerator());

            this.numerator = quotient.getNumerator();
            this.denominator = quotient.getDenominator();
        }

        return this;
    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            // compare this vs other here
            Fraction f = new Fraction(this);
            Fraction diff = f.subtract(other);
            // if(this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator())
            //     return true;
            if(diff.getNumerator() == 0)
                return true;
        }

        return false;
    }

    static public void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(-3, -4);
        Fraction f3 = new Fraction(2, -4);
        Fraction f4 = new Fraction(1, -2);
        Fraction f5 = new Fraction(5, -1);
        Fraction f6 = new Fraction(-3, 6);
        Fraction f7 = new Fraction(1, 4);
        Fraction f9 = new Fraction(0, 4);

        // f3.logFraction();
        // f4.logFraction();
        // f5.logFraction();
        // // f4.add(f5).logFraction();
        // f2.subtract(f7).logFraction();
        // f7.multiply(f2).logFraction();
        // // f4.divide(f3).logFraction();
        // // f4.divide(f2).logFraction();
        System.out.println(f4);
        System.out.println(f2);
        System.out.println(f4.add(f5));
        System.out.println(f4.subtract(f7));
        System.out.println(f4.multiply(f2));
        System.out.println(f4.divide(f9));
        System.out.println(f2);
        System.out.println(f9);

        System.out.println("compare result: " + f3.equals(f4));

        Fraction f8 = new Fraction(6, 2);

        f8.logFraction();
    }
}
