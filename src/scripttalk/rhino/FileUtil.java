/*
 * Sample code from a user group talk:
 * Java Scripting
 * 
 * Copyright 2006 Kyle Cordes
 * http://kylecordes.com
 * http://oasisdigital.com
 *
 * Feel free to mine this for ideas and snippets for your own projects.
 */

package scripttalk.rhino;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

	public static String readFile(String fileName)
			throws FileNotFoundException, IOException {
		StringBuilder builder = new StringBuilder();
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		String str;
		while ((str = in.readLine()) != null) {
			builder.append(str);
		}
		in.close();
		return builder.toString();
	}

}
