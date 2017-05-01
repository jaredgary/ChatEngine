package hn.com.chat.exception;

/**
 * The class ChatException contains the exception messages for ChatEngine-ejb
 * project.
 *
 * @author Gary Gonzalez <mailto:garygonzalezzepeda@gmail.com/>
 * @version 1.0.0
 * @since May 1, 2017
 */
public class ChatException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -754865863848618492L;

	/** The message. */
	private String message;

	/**
	 * Instantiates a new chat exception.
	 */
	public ChatException() {
		super();
	}

	/**
	 * Instantiates a new chat exception.
	 *
	 * @param message
	 *            the message
	 */
	public ChatException(final String message) {
		super(message);
		this.message = message;
	}

	/**
	 * Instantiates a new chat exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public ChatException(final String message, final Throwable cause) {
		super(message, cause);
		this.message = message;
	}

	/**
	 * Instantiates a new chat exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public ChatException(final Throwable cause) {
		super(cause);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *            the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
