
public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());


        System.out.println("--------------");

        Beverage beverage2 = new Espresso();
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
        System.out.println("--------------");
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

    }
}