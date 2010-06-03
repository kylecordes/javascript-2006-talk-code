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

public class WorkOrder {

	private final int id;
	
	private final String address;
	
	private final String product;
	
	private final int urgency;

	public WorkOrder(int id, String address, String product, int urgency) {
		this.id = id;
		this.address = address;
		this.product = product;
		this.urgency = urgency;
	}

	public String getAddress() {
		return address;
	}

	public String getProduct() {
		return product;
	}

	public int getUrgency() {
		return urgency;
	}

	public int getId() {
		return id;
	}

}
