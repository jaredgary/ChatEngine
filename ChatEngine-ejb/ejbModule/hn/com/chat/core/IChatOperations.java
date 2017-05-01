package hn.com.chat.core;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import hn.com.chat.response.MsgResponse;

/**
 * The interface IChatOperations contains the methods operations for
 * ChatEngine-ejb project.
 *
 * @author Gary Gonzalez <mailto:garygonzalezzepeda@gmail.com/>
 * @version 1.0.0
 * @since May 1, 2017
 */
@WebService(name = "ChatComponent", targetNamespace = "http://chat.com/ChatComponent/v1")
@SOAPBinding(parameterStyle = ParameterStyle.WRAPPED)
public interface IChatOperations {

	/**
	 * Send txt msg.
	 *
	 * @param to
	 *            the to
	 * @param from
	 *            the from
	 * @param msg
	 *            the msg
	 * @return the string
	 */
	@WebMethod(operationName = "sendTxtMsg")
	MsgResponse sendTxtMsg(@WebParam(name = "to") String to, @WebParam(name = "from") String from,
			@WebParam(name = "msg") String msg);

}
