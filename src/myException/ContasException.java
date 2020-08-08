package myException;

public class ContasException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ContasException() {
		super();
	}
	
	public ContasException(String message) {
		super(message);
	}

	public ContasException(String message, Exception cause) {
		super(message, cause);
	}
	
	public ContasException(Exception e) {
		super(e);
	}

}
