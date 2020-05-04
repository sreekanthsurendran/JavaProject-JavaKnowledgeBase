package com.java.singleton;

public class TestClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cloner obj = new Cloner();
		try {
			/**
			 * The clone method from Object class (which is protected)
			 * may not be visible. Hence we will have implement Clonable to clone 
			 * the object.
			 */
			obj.clone(); 
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}


class Cloner implements Cloneable {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
