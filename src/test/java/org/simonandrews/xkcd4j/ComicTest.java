package org.simonandrews.xkcd4j;

import static org.junit.Assert.fail;

import org.junit.Test;

public class ComicTest {
	public void canCreateComicInstance() {
		@SuppressWarnings("unused")
		Comic comic = new Comic(111);
	}

	@Test
	public void canGetData() {
		Comic comic = new Comic(111);
		String[] keys = {"month", "num", "link", "year", "news", "safe_title",
				"transcript", "alt", "img", "title", "day"};
		for(int i = 0; i < keys.length; i++) {
			Object val = comic.getData(keys[i]);
			if(val == null) {
				fail(String.format("Could not read data value for %s", keys[i]));
			}
		}
	}
}
