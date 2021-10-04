public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    String getName() {
        return name;
    }

    boolean getHungry() {
        return hungry;
    }


    int getAppetite() {
        return appetite;
    }

    public void eat(Plate r) {
        if (!hungry) {
            hungry = r.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return name + ", eat " + appetite + ", hungry " + hungry;
    }
}
