package org.simonandrews.xkcd4j.tests;

import org.simonandrews.xkcd4j.Comic;

/*
 * Output should be something like:
 * 
 * month: 3
 * num: 555
 * link: 
 * year: 2009
 * news: 
 * safe_title: Two Mirrors
 * transcript: [[A girl sets up a full mirror adjacent to a bathroom-counter mirror]]
 * [[The girl looks through the bathroom-counter mirror to see the infinite reflections]]
 * Girl: Bloody Mary, Bloody Mary, Bloody Mary.
 * <<RAAGHHHHH>>
 * [[Girl ducks as the infinite Bloody Marys pop out between the two mirrors above her head]]
 * {{Alt-Text: If you actually do this, what really happens is Douglas Hofstadter appears and talks to you for eight hours about strange loops.}}
 * alt: If you actually do this, what really happens is Douglas Hofstadter appears and talks to you for eight hours about strange loops.
 * img: http://imgs.xkcd.com/comics/two_mirrors.png
 * title: Two Mirrors
 * day: 13
 */

/**
 * Demo that shows off how to use Comic objects.
 * @author Simon Andrews
 */
public class Demo {
	public static void main(String[] args) {
		Comic c = new Comic(555);
		String[] keys = {"month", "num", "link", "year", "news", "safe_title",
				"transcript", "alt", "img", "title", "day"};
		for(int i = 0; i < keys.length; i++) {
			System.out.println(keys[i] + ": " + c.getData(keys[i]));
		}
	}
}