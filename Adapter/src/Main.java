public class Main {

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }


    public static void main(String[] args) {


        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey say: ");
        turkey.gobble();
        turkey.fly();


        System.out.println("\nthe duck say: ");
        testDuck(duck);

        System.out.println("\nthe turkeyAdapter say: ");
        testDuck(turkeyAdapter);

    }
}