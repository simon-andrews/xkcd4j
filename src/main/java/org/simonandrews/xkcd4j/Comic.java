package org.simonandrews.xkcd4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.simonandrews.xkcd4j.exceptions.ComicNotFoundException;

/**
 * Represents a comic on xkcd.
 * @author Simon Andrews
 */
public class Comic {
	private JSONObject jsonObject;
	/**
	 * xkcd comic constructor.
	 * @param comicNumber Number of the comic.
	 */
	public Comic(int comicNumber) {
		//This whole section adapted from: https://stackoverflow.com/a/238634
		URL url;
		InputStream is = null;
		BufferedReader br;
		
		JSONParser parser = new JSONParser();

		try {
			url = new URL(String.format("https://xkcd.com/%d/info.0.json", comicNumber));
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is));
			jsonObject = (JSONObject) parser.parse(br); 
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
		catch(FileNotFoundException e) {
			e.addSuppressed(new ComicNotFoundException("This comic does not exist."));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		finally {
			try {
	        	if (is != null) is.close();
	        }
	        catch (IOException e) {
	        	//stub
	        }
		}
	}
	/**
	 * Get a piece of data about the comic.
	 * @param key JSON key of data you want.
	 * @return Requested data
	 */
	public Object getData(String key) {
		return jsonObject.get(key);
	}
}
