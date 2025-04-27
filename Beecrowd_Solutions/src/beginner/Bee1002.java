package beginner;

import java.util.Scanner;

public class Bee1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ray = sc.nextDouble();
		double calc = 3.14159 * (Math.pow(ray, 2));
		System.out.printf("A=" + "%.4f\n", calc);

	}

}
