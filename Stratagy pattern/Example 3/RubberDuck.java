public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new MakeSound();
        flyBehavior = new NoWayFly();
    }

    @Override
    public void display() {
      System.out.println("I'm a rubber duck");
    }

}
