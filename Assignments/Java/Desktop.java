package day6.Assignments.Java;

public class Desktop implements Hardware, Software{
	public void desktopModel() {
		System.out.println("This is a new dektop model");
	}
	public void hardwareResources() {
		System.out.println("Need hardware resources");
		
	}

	public void softwareResources() {
		System.out.println("Need software resources");

		
	}


	public static void main(String[] args) {
		Desktop dp=new Desktop();
	dp.desktopModel();
	dp.hardwareResources();
	dp.softwareResources();
	}

	


}
