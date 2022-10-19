package learnJava.day1.Intro;
import java.io.*;
public class Practice2 {
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter your Salary-");
		float sal=Float.valueOf(br.readLine()).floatValue();
		System.out.print(sal);
		
	}

}
