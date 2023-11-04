
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int x1 = input.nextInt();
		int x2 = input.nextInt();
		int x3 = input.nextInt();

		int sum = x1 + x2 + x3;
		int mult = x1 * x2 * x3;
		double avr = (x1 + x2 + x3) / 3.0;
		System.out.println("Sum = " + sum);
		System.out.println("Mult = " + mult);
		System.out.println("Avr = " + avr);
		System.out.println("Pow = " + (Math.pow(x1, x2)));
	}

}
