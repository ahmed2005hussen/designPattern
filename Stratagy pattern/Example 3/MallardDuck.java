public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new MakeSound();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
