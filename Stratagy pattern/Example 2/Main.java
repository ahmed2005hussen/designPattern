public class Main{
    public static void main(String []args){
        StratagyPayment a1 = new StratagyPayment(new cash());
        StratagyPayment a2= new StratagyPayment(new card());
        a1.pay(10);
        a2.pay(10);
        a2 = new StratagyPayment(new cash());
        a2.pay(10);
    }
}