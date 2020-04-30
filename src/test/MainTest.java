package test;

import domain.Main;
/**
 * A class that contains the sum output method
 * @author IT-Service
 */
public class MainTest {
	/**
	 * Output the sum of array elements
	 * @param args - contains the arguments provided
	 */
	public static void main(String[] args) {
		int array[][]=new int[2][3];
	
        Main calc = new Main();
        System.out.println("Sum of array elements = " + calc.Calculate(array));
	}
}
