package bsu.rfe.java.group6.lab1.Brenchaninov.varA;

public class Apple extends Food {
	private String size;
	
	public Apple(String size) {
		super("Apple");
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void consume() {
		System.out.println(this + " was eaten");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " of size " + "\"" + size.toUpperCase() + "\"";
	}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Apple)) return false;
			return size.equals(((Apple)arg0).size);
		} 
		else {
			return false;
		}	
	}
}
