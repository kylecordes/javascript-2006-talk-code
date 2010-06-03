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

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class OrderingMain {

	// Note which thread this is created in.
	//private final OrderingWidget orderingWidget = new OrderingWidget();
	private final OrderingWidget orderingWidget = new ScriptableOrderingWidget();

	private void createAndShowGUI() {
		JFrame frame = new JFrame("Work Order Arranging Demo, with Scripting");
		JPanel panel = new JPanel(new BorderLayout());
		JLabel topLabel = new JLabel("Drag and drop the work orders.");
		topLabel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
		panel.add(topLabel, BorderLayout.NORTH);
		panel.add(orderingWidget.getComponent(), BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setOpaque(true); // content panes must be opaque
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				super.windowClosed(e);
				orderingWidget.shutdown();
			}
		});

		populateRandomSampleData();
	}

	private void populateRandomSampleData() {
		List<WorkOrder> wos = new ArrayList<WorkOrder>();
		for (int i = 0; i < 50; i++) {
			String product = "Delivery for " + RandomData.makeName();
			int urgency = (int) (System.nanoTime() % 4 + 1);
			wos.add(new WorkOrder(i, RandomData.makeAddress(), product,
							urgency));
		}
		orderingWidget.load(wos);
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticXPLookAndFeel");

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new OrderingMain().createAndShowGUI();
			}
		});
	}
}
