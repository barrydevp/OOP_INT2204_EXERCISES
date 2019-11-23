import java.text.DecimalFormat;

public class Numeral extends Expression {
	private double value;

	public Numeral(double value) {
		this.value = value;
	}

	public Numeral() {
		this.value = 0;
	}

	public String toString() {
		// return String.valueOf(value);
		DecimalFormat df = new DecimalFormat("###.#");
		return df.format(value);
		// return Double.toString(value);
	}

	public double evaluate() {
		return value;
	}
}