package org.simonandrews.xkcd4j.exceptions;

public class ComicNotFoundException extends Throwable {
	public ComicNotFoundException() {
		super.printStackTrace();
	}
	public ComicNotFoundException(String message) {
		super(message);
		super.printStackTrace();
	}
}
