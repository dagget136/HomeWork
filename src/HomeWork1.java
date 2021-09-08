class HomeWorkApp {

	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	static void checkSumSign() {
		int a = 5;
		int b = 3;
		if (a +b >= 0) {
			System.out.println("сумма положительная");
		} else {
			System.out.println("сумма отрицательная");
		}
	}
	static void printColor() {
		int value = 101;
		if (value <= 0) {
			System.out.println("Красный");
		} else if (value <= 100) {
			System.out.println("Желтый");
		} else if (value > 100) {
			System.out.println("Зеленый");
		}

	}
	static void compareNumbers() {
		int c = 10;
		int d = 10;
		if (c >= d) {
			System.out.println(c + ">=" + d);
		}else if (c < d) {
			System.out.println(c + "<" + d);
		}
	}



}