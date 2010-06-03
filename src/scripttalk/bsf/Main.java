package scripttalk.bsf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.bsf.BSFEngine;
import org.apache.bsf.BSFManager;

import org.mozilla.javascript.Context;

public class Main {

	public static void main(String[] args) throws Exception {
		Map<String, String> registry = new HashMap<String, String>();
		String scriptFileName = "src/scripttalk/bsf/main.js";

		// I didn't have time to get the Rhino-via-BSF incantation just right,
		// so this bit of Rhino API is needed so that Rhino doesn't fail
		// with a "no context" error.
		Context cx = Context.enter();
		try {
			String lang = BSFManager.getLangFromFilename(scriptFileName);

			BSFManager bsfMan = new BSFManager();
			BSFEngine engine = bsfMan.loadScriptingEngine(lang);

			Commands commands = new Commands();
			bsfMan.declareBean("commands", commands, null);

			String script = readFile(scriptFileName);
			bsfMan.eval(lang, scriptFileName, 0, 0, script);

			engine.call(null, "start", new Object[] { registry });
		} finally {
			Context.exit();
		}
	}

	private static String readFile(String fileName)
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
