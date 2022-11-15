package week3day2assign;

import java.lang.reflect.Array;
import java.util.Arrays;

//Here is the input
	//	int[] data = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		
public class FindSecondele {

	public static void main(String[] args) {
		int data[]= {3,2,11,4,6,7};
		 Arrays.sort(data);
		 for (int i = 0; i < data.length; i++) {
			 
			
			if(data[i]==(data.length))
				 System.out.println("The second largest nnumber is "+data[4]);
			
		 }
					 
			 
	}

}
