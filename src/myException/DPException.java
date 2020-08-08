package myException;

public class DPException extends RuntimeException{

    public DPException() {
        super();
    }

    public DPException(String message) {
        super(message);
    }

    public DPException(String message, Throwable cause) {
        super(message, cause);
    }

    public DPException(Throwable cause) {
        super(cause);
    }
	
}
