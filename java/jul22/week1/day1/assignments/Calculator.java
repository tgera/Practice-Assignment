package jul22.week1.day1.assignments;

public class Calculator {
	public double add(double a,double b) {
	double result=a+b;
		return result;
	
	}
	public double sub(double a,double b) {
		double result=a-b;
			return result;
		
		}
	public double mul(double a,double b) {
		double result=a*b;
			return result;
		
		}
	public double divide(double a,double b) {
		double result=a/b;
			return result;
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator Cal=new Calculator();
System.out.println(Cal.add(5.8,8.9));
System.out.println(Cal.sub(5.8,8.9));
System.out.println(Cal.mul(5.8,8.9));
System.out.println(Cal.divide(5.8,8.9));

	}


}