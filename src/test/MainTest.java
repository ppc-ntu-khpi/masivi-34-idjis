package test;

import java.util.Arrays;
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
		
		int array[][] = {
						{6,8,10}, 
						{3,4,5}
						};
		
		for(int[] i:array) {
			System.out.println(Arrays.toString(i));
		}
		
        Main calc = new Main();
        System.out.println("Sum of array elements = " + calc.Calculate(array));
	}
}
