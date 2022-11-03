package day6.Assignments.Java;

public class MethodOverloading {
	public int add(int a, int b) {
		int result= a+b;
		return result;		
	}
	public int add (int a, int b, int c) {
		int result = a+b+c;
		return result;
		
	}
	public int sub(int a, int b) {
		int result = a-b;
		return result;
	}
	public double sub(double a, double b, double c) {
		double result=a-b-c;
		return result;
	}
	public int mul(int a, int b) {
		int result=a*b;
		return result;
	}
	public double mul(int a, double b) {
		double result=a*b;
		return result;				
	}
	public int div(int a, int b){
		int result=a/b;
		return result;
	}
	public double div(double a, int b) {
		double result=a/b;
		return result;
	}
	

	public static void main(String[] args) {
		MethodOverloading mol=new MethodOverloading();
		System.out.println(mol.add(88, 22));
		System.out.println(mol.add(56, 60, 42));
		System.out.println(mol.sub(100, 22));
		System.out.println(mol.sub(88.45, 45.32,12.67));
		System.out.println(mol.mul(78, 22));
		System.out.println(mol.mul(88, 22.87));
		System.out.println(mol.div(88, 22));
		System.out.println(mol.div(88.64, 22));

	}

}
