package cn.com.ttg.api.exception;

public class TTGException extends RuntimeException {

	private static final long serialVersionUID = 219521815178624337L;

	public TTGException() {
	}

	public TTGException(String message) {
		super(message);
	}

	public TTGException(Throwable cause) {
		super(cause);
	}

	public TTGException(String message, Throwable cause) {
		super(message, cause);
	}
}
