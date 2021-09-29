public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200, -1);
        Dog dog = new Dog(500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal.run(100));
            System.out.println(animal.run(220));
            System.out.println(animal.run(530));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(11));

        }
    }
}
