abstract class Animal implements IAnimal {
    private int distanceRun;
    private int distanceSwim;
    private String className;

    public Animal(int distanceRun, int distanceSwim) {
    this.distanceRun = distanceRun;
    this.distanceSwim = distanceSwim;
    className = getClass().getSimpleName();
    }

    public String getClassName() {
        return className;
    }

    public String run (int distance) {
        if (distance < distanceRun) {
            return className + " Ran " + distance;
        } else {
            return className + " Couldn't run " + distance;
        }
    }

    public String swim (int distance) {
        if (distance < distanceSwim) {
            return className + " Swam " + distance;
        } else {
            return className + " Could not swim " + distance;
        }
    }

}
