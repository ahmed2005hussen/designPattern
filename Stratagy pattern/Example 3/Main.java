public class Main{
    public static void main(String []args){

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();
        mallardDuck.swim();
        System.out.println("---------");
        Duck rubberduck = new RubberDuck();
        rubberduck.display();
        rubberduck.quack();
        rubberduck.fly();
        rubberduck.swim();
        rubberduck.setQuackBehavior(new silence());
        System.out.println("After changing the quack behavior");

        rubberduck.display();
        rubberduck.quack();
        rubberduck.fly();
        rubberduck.swim();
    }
}