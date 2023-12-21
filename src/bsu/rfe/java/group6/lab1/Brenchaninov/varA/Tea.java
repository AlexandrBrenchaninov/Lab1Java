package bsu.rfe.java.group6.lab1.Brenchaninov.varA;

public class Tea extends Food {
	private String color;
	public Tea(String color) {
		super("Tea");
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void consume() {
		System.out.println(this + " was eaten");
	}
	@Override
	public String toString() {
		return super.toString() + " of color " + "\"" + color + "\"";
	}
	public boolean equals(Object obj) {
		if(obj == null)return false;
		if(!(obj.getClass() == this.getClass()))return false;
		return ((Tea)obj).getColor() == this.getColor();
	}
	
}
