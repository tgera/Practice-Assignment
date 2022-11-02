package day5.PassInputGetOutput;

public class Calculator {
	public int add (int a,int b) {
		int result=a+b;
		return result;
		}
	public double sub (double a, double b) {
		double result = a-b;
		return result;	
	}
	public double mul (double a, double b) {
		double result = a*b;
		return result;
	}
	public int div (int a, int b) {
		int result = a/b;
		return result;		
	}
	public static void main(String[] args) {
Calculator cl=new Calculator();
System.out.println(cl.add(68, 100));
System.out.println(cl.sub(234.890, 100.890));
System.out.println(cl.mul(123.670, 100.90));
System.out.println(cl.div(100, 2));

	}

}
