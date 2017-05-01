package hn.com.chat.utils;

/**
 * The enum ChatEnum contains the enumeration message for ChatEngine-ejb
 * project.
 *
 * @author Gary Gonzalez <mailto:garygonzalezzepeda@gmail.com/>
 * @version 1.0.0
 * @since May 1, 2017
 */
public enum ChatEnum {

	/** The success operation. */
	SUCCESS_OPERATION(0, "Operation successfull", "The msg has been sent successfuly");

	/** The code. */
	private final int code;

	/** The message. */
	private final String message;

	/** The message detail. */
	private final String messageDetail;

	/**
	 * Instantiates a new chat enum.
	 *
	 * @param code
	 *            the code
	 * @param message
	 *            the message
	 * @param messageDetail
	 *            the message detail
	 */
	private ChatEnum(final int code, final String message, final String messageDetail) {
		this.code = code;
		this.message = message;
		this.messageDetail = messageDetail;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Gets the message detail.
	 *
	 * @return the message detail
	 */
	public String getMessageDetail() {
		return messageDetail;
	}

}
