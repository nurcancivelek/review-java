package Review12;

public class Phone {

	private String serialNumber; 
	String color;
	
	public Phone(String serialNr) {
		this.serialNumber=serialNr;//we dont have to do this
	}
	
	public void sendText(String number, String text) {
		System.out.println("Sending "+text+" to "+number);
	}
	
	public String getSerialNumber(String password) {
		String result="";
		if(password.equals("123456")) {
			result=serialNumber;
		}else {
			result="Access denied!";
		}
		return result;
	}

//	public void setSerialNumber(String serialNumber) {
//		this.serialNumber = serialNumber;
//	}
	
	public void call(String number) {
		System.out.println("Calling "+number);
	}
	
	public void displayInfo() {
		System.out.println("I am a "+color +" phone. Serial number is " +serialNumber);
	}
}
