package hn.com.chat.core;

import javax.ejb.Stateless;
import javax.jws.WebService;

import hn.com.chat.response.MsgResponse;

/**
 * The class ChatImplementation contains the implementation of all operations
 * for ChatEngine-ejb project.
 *
 * @author Gary Gonzalez <mailto:garygonzalezzepeda@gmail.com/>
 * @version 1.0.0
 * @since May 1, 2017
 */
@Stateless
@WebService(serviceName = "ChatComponent", endpointInterface = "hn.com.chat.core.IChatOperations")
public class ChatImplementation implements IChatOperations {

	/**
	 * Instantiates a new chat implementation.
	 */
	public ChatImplementation() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hn.com.chat.core.IChatOperations#sendTxtMsg(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public MsgResponse sendTxtMsg(final String to, final String from, final String msg) {
		return null;
	}

}
