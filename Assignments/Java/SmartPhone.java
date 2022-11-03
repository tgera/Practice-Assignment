package day6.Assignments.Java;
//Method OverRiding Assignment
public class SmartPhone extends AndroidPhone{
public void takeVideo() {
	System.out.println("This is from SmartPhone Class");
	//super.takeVideo();
}
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone();
		sp.takeVideo();
		AndroidPhone ap=new AndroidPhone();
		ap.takeVideo();
	
		
		


	}

}
