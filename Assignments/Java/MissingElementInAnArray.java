package day6.Assignments.Java;
import java.util.Arrays;
public class MissingElementInAnArray {

	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i=0; i<arr.length;i++)
		{
			if (i!=arr[i])
			{
				System.out.println(arr[i]);
				break;
				
			}
	}

}
}