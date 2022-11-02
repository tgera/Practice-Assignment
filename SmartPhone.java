package day5.Assignment.Inheritance;

public class SmartPhone extends AndroidPhone {
	
		
public void connectWhatsApp() {
	System.out.println("Please connect through whatsapp");
}

	public static void main(String[] args) {
SmartPhone sp=new SmartPhone();
sp.connectWhatsApp();

	}

}
