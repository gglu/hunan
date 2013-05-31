/**
 * 
 */
package com.soft.image;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator
 *
 */
public class ImageFinder {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("src/main/webapp/css/user.css");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		Pattern p = Pattern.compile("\\(\\.\\./images/(.*\\.jpg)\\)");
		String line = br.readLine();
		
		SortedSet<String> images = new TreeSet<String>();
		
		while( line != null){
			Matcher m = p.matcher(line);
			
			boolean result = m.find();
	        if (result) {
	            do {
	            	images.add(m.group(1));
	                result = m.find();
	            } while (result);
	        }
			line = br.readLine();
		}
		
		for(String s : images)
			System.out.println(s);
			
		
	}

}
