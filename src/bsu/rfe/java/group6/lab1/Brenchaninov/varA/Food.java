package bsu.rfe.java.group6.lab1.Brenchaninov.varA;

public abstract class Food implements Consumable {
	private String name;
	
	public Food(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Food)) return false;
		if(name == null || ((Food)obj).getName() == null) return false;
		return name.equals(((Food)obj).getName());
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public void consume() {
		// TODO Auto-generated method stub

	}

}
