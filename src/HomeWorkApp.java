/**
 * Java 1. Home work 1
 *
 * @author Toryanik Vladimir
 * @version 06 Sep 2021
 */
public class HomeWorkApp {
	public static void main(String[] args) {
	printThreeWords();
	checkSumSign();
	printColor();
	compareNumbers();
	}
	static void printThreeWords(){
	System.out.println("Orange");
	System.out.println("Banana");
	System.out.println("Apple");
	}
	static void checkSumSign(){
		int a = 5;
		int b = 3;
		if (a + b >=0){
			System.out.println("Сумма положительная");
		}else {
			System.out.println("Сумма отрицательная");
		}
	}
	static void printColor(){
		int value = 101;
		if (value <= 0){
			System.out.println("red");
		}else if (value <= 100){
			System.out.println("yellow");
		}else if (value > 100){
			System.out.println("green");
		}
	}
	static void compareNumbers(){
		int c = 10;
		int d = 10;
		if (c >= d){
			System.out.println(c + ">=" + d);
		}else if (c < d){
			System.out.println(c +"<" + d);
		}
	}
}