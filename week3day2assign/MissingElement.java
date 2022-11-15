package week3day2assign;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				int n=arr.length;
				// Sort the array	
				Arrays.sort(arr);
				 int sum = (n*(n+1))/2;
			      int sumArr = 0;
			      for(int i=0; i<=n-2; i++) {
			         sumArr = sumArr+arr[i];
			      }
			      int missingNumber = sum-sumArr;
			      System.out.println("Missing number is : "+missingNumber);
			   }
				}


