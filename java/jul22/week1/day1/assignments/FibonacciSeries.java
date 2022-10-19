package jul22.week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
int range=8;
int firstnum=0;
int secnum=1;
int sum=1;
System.out.println(firstnum);
for(int i=1;i<=range; i++)
{
	System.out.println(sum);
sum=firstnum+secnum;
firstnum=secnum;
secnum=sum;

	}

}
}