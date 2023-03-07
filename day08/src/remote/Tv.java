package remote;

public class Tv implements Remote {

	@Override
	public void turnOn() {
		System.out.println("tv On");
	}

	@Override
	public void turnOff() {

		System.out.println("tv Off");
	}

}
