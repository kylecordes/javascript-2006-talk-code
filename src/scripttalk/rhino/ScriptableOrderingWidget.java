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

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class ScriptableOrderingWidget extends OrderingWidget {

	private Context cx = Context.enter();

	private Scriptable scope = cx.initStandardObjects();

	private String scriptFileName = "src/scripttalk/rhino/rules.js";

	@Override
	public void shutdown() {
		Context.exit();
	}

	boolean canDrag(WorkOrderPanel pan) {
		try {
			String script = FileUtil.readFile(scriptFileName);
			WorkOrder order = pan.getWorkOrder();
			cx.evaluateString(scope, script, "", 1, null);
			scope.put("order", scope, order);
			Object result = cx.evaluateString(scope, "canDrag()", "", 1, null);
			return "ok".equals(result);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
