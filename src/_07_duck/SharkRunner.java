package _07_duck;

import javax.swing.JOptionPane;

public class SharkRunner {
	public static void main(String[] args) {
String name = JOptionPane.showInputDialog("What is the sharks name?");
		
	Shark Gerald = new Shark(1,name);

Gerald.eat();
Gerald.smellBlood();
	}
}
