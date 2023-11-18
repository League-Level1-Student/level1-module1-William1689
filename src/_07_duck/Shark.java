package _07_duck;

public class Shark {

int mealsEaten ;
String name ;

void eat() {
	System.out.println( name + " found some prey and decided to eat in in one huge bite");
}

void smellBlood() {
	System.out.println(name + " smells human blood far ways. He swims toward it an dhe might find another meal ");
}

Shark(int mealsEaten, String name){
	this.mealsEaten =  mealsEaten;
	this.name = name;
}



}
