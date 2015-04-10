# xkcd4j ![Build Status](https://travis-ci.org/simon-andrews/xkcd4j.svg?branch=master)
Unofficial Java library for getting xkcd comics.

## Using
```java
import org.simonandrews.xkcd4j.Comic;

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
```
