class Cat extends Animal {
    Cat(int distanceRun, int distanceSwim) {
        super(distanceRun, distanceSwim);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " Can't swim";
    }
}