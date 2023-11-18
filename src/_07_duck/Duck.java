package _07_duck;

public class Duck {

int numOfFriends ;
String favoriteFood ;

void quack() {
	System.out.println("The duck was wandering in the forest when he meet his freind, Gerald. He said hello with a qyack") ;
}

void waddle() {
	System.out.println("The duck was very thristy today so he decide to waddle up to a lemonade stand");
}


Duck(String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numOfFriends = numberOfFriends;
}

}


