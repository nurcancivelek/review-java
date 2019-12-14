package Review12;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone ph=new Phone("123-456-7654");
		ph.sendText( "1234" , "Privet");
		ph.call("345-654-0998");
		ph.color="Blue";
		ph.displayInfo();
		//System.out.println(ph.serialNumber());
		
		System.out.println(ph.getSerialNumber("123345"));
		System.out.println(ph.getSerialNumber("123456"));
			
		System.out.println("---Smartphone generation----");
			
		Phone iphone1=new SmartPhone("i1234563", "Red");
		iphone1.displayInfo();
		iphone1.call("12345");
		iphone1.sendText("1234321", "Selam");
		((SmartPhone) iphone1).alarmRinging();
		((SmartPhone) iphone1).playGames();
		
		//downcasting explicitly or manually	
		SmartPhone smartPhone1=(SmartPhone)iphone1;	
		smartPhone1.showWeather();
		smartPhone1.takePicture();
		smartPhone1.alarmRinging();
		smartPhone1.playGames();
	}
	

}
