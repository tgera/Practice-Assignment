package day6.Assignments.Java;
import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargest {

	
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("Size of the array-"+ data.length);
		for (int i=0; i<data.length;i++)
						System.out.println(data[i]);
		System.out.println("Second last digit-"+ data[data.length-2]);
			
	

	}

}
