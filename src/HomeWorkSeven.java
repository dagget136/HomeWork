public class HomeWorkSeven {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 10);
        cats[1] = new Cat("Tom", 15);
        cats[2] = new Cat("Twix", 15);
        Plate plate = new Plate(30);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        plate.addFood(20);
        System.out.println(plate);
        for (Cat cat : cats) {
                cat.eat(plate);
                System.out.println(cat);

        }
        System.out.println(plate);
    }
}
