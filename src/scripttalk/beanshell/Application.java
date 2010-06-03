package scripttalk.beanshell;

import javax.swing.JFrame;

import bsh.Interpreter;

public class Application {
	public static void main(String[] args) throws Exception {
		Interpreter i = new Interpreter(); 
		JFrame frame = new JFrame( "My Frame" );
		i.set("frame", frame);
		i.source("src/scripttalk/beanshell/example.bsh");
		
		// To demonstrate the point that BeanShell makes it easy to move between
		// compiled code and script, comment out the line above and paste in the
		// script contents unmodified here.
		
		frame.pack();
		frame.setVisible(true);
	}

}
