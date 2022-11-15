package week3day2assign;

public class PrintDuplicateArray {

	public static void main(String[] args) {
					
			int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length+1; j++) {
					count=count+1;
					if(arr[i]==arr[j])
						
						System.out.println("Duplicate Element in the Array "+arr[i]);
						break;
				}
			}
	}

}
