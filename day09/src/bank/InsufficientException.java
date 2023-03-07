package bank;

public class InsufficientException extends Exception {
	public InsufficientException() {
	}

	public InsufficientException(String msgcode) {
		super(msgcode);
	}
}
