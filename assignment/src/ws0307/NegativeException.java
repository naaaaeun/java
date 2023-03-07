package ws0307;

public class NegativeException extends Exception {
	public NegativeException() {}
	
	public NegativeException(String msgcode) {
		super(msgcode);
	}
}
