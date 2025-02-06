class LakeDuck implements Duck, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("Lake Duck swims.");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck flies.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}
