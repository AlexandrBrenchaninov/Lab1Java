package bsu.rfe.java.group6.lab1.Brenchaninov.varA;

public class Main {

	public static void main(String[] args) {
		Food[] breakfast = new Food[20];
		
		for(int i = 0; i < args.length; i++) {
			String arg = args[i];
			String[] parts = arg.split("/");
			if(parts[0].equals("Apple")) {
				breakfast[i] = new Apple(parts[1]);
			}
			else if(parts[0].equals("Tea")){
				breakfast[i] = new Tea(parts[1]);
			}
		}
		
		for(int i = 0; i < breakfast.length; i++) {
			if(breakfast[i] != null) breakfast[i].consume();
			else break;
		}
		
		Apple appleToCompare = new Apple("Big");
		int count = 0;
		for(int i = 0; i < breakfast.length; i++) {
			if(breakfast[i] != null) {
				if(breakfast[i].equals(appleToCompare)) {
					count++;
				}
			}
			
		}
		System.out.println(count + "Объектов " + appleToCompare);
	}

}
