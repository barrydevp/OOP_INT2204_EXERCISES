public class ExpressionTest {
	public static void main(String[] args) throws Exception {
		Expression zero = new Numeral(0);
		Expression number = new Numeral(1);
		Expression number1 = new Numeral(1.5);
		Expression number2 = new Numeral(2.5);
		Expression add1 = new Addition(number1, number2);
		System.out.println(add1.toString());
		System.out.println(add1.evaluate());
		Expression square = new Square(number);
		Expression add2 = new Addition(square, add1);
		System.out.println(add2.toString());
		System.out.println(add2.evaluate());

		Expression sub = new Subtraction(square, add1);
		System.out.println(sub.toString());
		System.out.println(sub.evaluate());

		Expression mul = new Multiplication(square, add1);
		System.out.println(mul.toString());
		System.out.println(mul.evaluate());

		Expression div = new Division(square, zero);
		System.out.println(div.toString());
		
		try {
			System.out.println(div.evaluate());
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}