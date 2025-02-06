class RubberDuck implements Duck, Squeakable {
    @Override
    public void swim() {
        System.out.println("Rubber Duck swims.");
    }

    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks.");
    }
}
