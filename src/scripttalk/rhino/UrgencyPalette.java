/*
 * Sample code from a user group talk:
 * Direct Manipulation with Swing
 * 
 * Copyright 2005 Kyle Cordes
 * http://kylecordes.com
 * http://oasisdigital.com
 *
 * Feel free to mine this for ideas and snippets for your own projects.
 */
package scripttalk.rhino;

import java.awt.Color;

/**
 * This hands out 4 colors, in decreasing order of how 
 * "urgent" they look.
 */
public class UrgencyPalette {

	private static Color make(Color baseColor, int desaturation) {
		float[] comps = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(),
				baseColor.getBlue(), null);
		return Color.getHSBColor(comps[0], comps[1] / desaturation, comps[2]);
	}

	private static final Color[] colors = {
		make(Color.RED, 4),
		make(new Color(0xffd9b3), 1),
		make(Color.YELLOW, 4),
		make(Color.GREEN, 4) };

	public static Color getColor(int urgency) {
		return colors[urgency - 1];
	}
}
