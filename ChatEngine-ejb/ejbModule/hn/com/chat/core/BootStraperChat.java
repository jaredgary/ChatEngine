package hn.com.chat.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.apache.log4j.Logger;

/**
 * The class BootStraperChat contains the <Usage of this class> for
 * ChatEngine-ejb project.
 *
 * @author Gary Gonzalez <mailto:garygonzalezzepeda@gmail.com/>
 * @version 1.0.0
 * @since May 1, 2017
 */
@Singleton
@Startup
public class BootStraperChat {

	/** The Constant LOG. */
	private static final Logger LOG = Logger.getLogger(BootStraperChat.class);

	/** The chat server. */
	private ChatServer chatServer;

	/**
	 * Instantiates a new boot straper chat.
	 */
	public BootStraperChat() {
		LOG.info("BootStraperChat is up.");
	}

	/**
	 * Inits the.
	 */
	@PostConstruct
	public void init() {
		this.chatServer = new ChatServer();
		this.chatServer.setName("Chat_Server_Thread");
		this.chatServer.start();
	}

	/**
	 * Destroy.
	 */
	@PreDestroy
	public void destroy() {
		this.chatServer.getExecutorService().shutdown();
		this.chatServer.interrupt();
		this.chatServer.setActivated(false);
		LOG.warn("BootStraperChat is down.");
	}

	/**
	 * Gets the chat server.
	 *
	 * @return the chat server
	 */
	public ChatServer getChatServer() {
		return chatServer;
	}

}
