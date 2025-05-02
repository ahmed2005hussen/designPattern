public class cash implements PaymenMethod {
    @Override
    public int pay(int amount) {
        System.out.println("Cash: "+amount);
        return 1;
    }
}
