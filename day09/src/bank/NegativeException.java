package bank;

public class NegativeException extends Exception {
	public NegativeException() {}
	
	public NegativeException(String msgcode) {
		super(msgcode);
	}
}
