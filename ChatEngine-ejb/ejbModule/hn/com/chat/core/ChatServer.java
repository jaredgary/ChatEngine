package hn.com.chat.core;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

/**
 * The class ChatServer contains the clients transactions for ChatEngine-ejb
 * project.
 *
 * @author Gary Gonzalez <mailto:garygonzalezzepeda@gmail.com/>
 * @version 1.0.0
 * @since May 1, 2017
 */
public class ChatServer extends Thread {

	/** The Constant LOG. */
	private static final Logger LOG = Logger.getLogger(ChatServer.class);

	/** The executor service. */
	private ThreadPoolExecutor executorService;

	/** The working queue. */
	private BlockingQueue<Runnable> workingQueue;

	/** The activated. */
	private boolean activated;

	/** The thread sleep. */
	private Long threadSleep;

	/**
	 * Instantiates a new chat server.
	 */
	public ChatServer() {
		this.threadSleep = 1000L;
		this.activated = true;
		this.workingQueue = new ArrayBlockingQueue<Runnable>(10000);
		this.executorService = new ThreadPoolExecutor(10, 48, 200, TimeUnit.MILLISECONDS, workingQueue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {

		while (activated) {
			try {
				Thread.sleep(threadSleep);
			} catch (InterruptedException e) {
				LOG.error(e.getMessage(), e);
				break;
			}
		}
	}

	/**
	 * Checks if is activated.
	 *
	 * @return true, if is activated
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * Gets the executor service.
	 *
	 * @return the executor service
	 */
	public ThreadPoolExecutor getExecutorService() {
		return executorService;
	}

	/**
	 * Sets the activated.
	 *
	 * @param activated
	 *            the new activated
	 */
	public void setActivated(final boolean activated) {
		this.activated = activated;
	}

}
