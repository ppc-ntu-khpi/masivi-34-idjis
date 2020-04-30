package domain;
/**
 * A class that contains a method for implementing the task
 * @author IT-Service
 */
public class Main {
	/**
	 * A method that contains filling the matrix with random numbers and calculates the sum of the elements
	 * @param a - array initialization
	 * @return summ - return value
	 */
	public int Calculate(int[][] array) {
		
		int summ=0;
		
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summ += array[i][j];
            }
        }
        
    return summ;
    }
	
}