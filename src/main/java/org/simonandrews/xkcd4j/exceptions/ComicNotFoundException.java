package org.simonandrews.xkcd4j.exceptions;

/**
 * Exception thrown when a requested comic can not be found.
 * @author Simon Andrews
 */
public class ComicNotFoundException extends Throwable {
	public ComicNotFoundException() {
		super.printStackTrace();
	}
	public ComicNotFoundException(String message) {
		super(message);
		super.printStackTrace();
	}
}
