public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    int getFood() {
        return food;
    }

    void setFood(int food) {
        this.food = food;
    }

    boolean decreaseFood(int foods) {
        if (food < foods) {
            return false;
        }
        this.food -= foods;
        return true;
    }

    void addFood(int meat) {
        if (this.food + meat >= 0) {
            this.food += meat;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
