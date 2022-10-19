package day2.practice;
import day2.practice.PublicPark;
public class MyHome {
	private String bed="queen";
	public void bedRoom() {
		
		System.out.println(bed);
		
	}

	public static void main(String[] args) {

		
PublicPark Pp=new PublicPark();
MyHome Mh=new MyHome();
Mh.bedRoom();
System.out.println(Pp.swing);
System.out.println(Pp.playground);




	}

}
