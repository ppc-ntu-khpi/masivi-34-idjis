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
		int x = array.length;
		int summ=0;
		
		for (int i=0;i < array.length;i++){
		    for (int j=0;j < array[i].length;j++){
		    	array[i][j]=(int)(Math.random()*10);
		      }
		     }
		
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
            }
        }
        
        for (int i=0;i<x;i++){          
            for(int j=0;j<x;j++){
                summ+=array[i][j];
            }
        }
        
    return summ;
    }
	
}