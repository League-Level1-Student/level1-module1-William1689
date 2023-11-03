package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog(null,"What flavor of popcorn would you like to eat?");
	
	Popcorn popcorn = new Popcorn(flavor);
	String time = JOptionPane.showInputDialog(null,"How many minutes would you like to cook your popcorn for?");
	int t = Integer.parseInt(time);
	Microwave mic = new Microwave();
	
	mic.putInMicrowave(popcorn);
	mic.setTime(t);
	mic.startMicrowave();
	
	
	
	
	
}
}
