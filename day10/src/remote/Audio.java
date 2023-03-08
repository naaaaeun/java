package remote;

public class Audio implements Remote {

	@Override
	public void turnOn() {
		System.out.println("audio On");
	}

	@Override
	public void turnOff() {

		System.out.println("audio Off");
	}

}
