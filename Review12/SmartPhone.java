package Review12;

public class SmartPhone extends Phone implements Weather, Camera, Games, Alarm {

	public SmartPhone(String serialNr) {
		super(serialNr);
		
	}
	public SmartPhone(String serialNr, String color) {
		super(serialNr);
		super.color=color;//this.color=color also works
	}
	//polymorhpism
	@Override
	public void showWeather() {
		System.out.println("Showing the weather...");
		
	}
	@Override
	public void takePicture() {
		System.out.println("Taking a high quality pic");
	}
	@Override
	public void recordVideo() {
		System.out.println("recording videos...");
		
	}
	public void displayInfo() {
		System.out.println("I am a " + color + " smart phone!");
	}
	@Override
	public void alarmRinging() {
		System.out.println(" wake up at 6:00 everyday!!");
		
	}
	@Override
	public void playGames() {
		System.out.println(" games are fun!");
		
	}
	

}
