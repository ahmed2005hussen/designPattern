public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void fly() {
        flyBehavior.fly();
    }
    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior ;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior ;
    }

    public void swim() {
        System.out.println("swim Duck");
    }

     public abstract void display() ;
}
