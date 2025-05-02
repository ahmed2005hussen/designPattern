public class card implements PaymenMethod {
    @Override
    public int pay(int amount) {
        System.out.println("Card: " + amount);
        return 2;
    }

}
