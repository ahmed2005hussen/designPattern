public class StratagyPayment {
    PaymenMethod paymen;
    public StratagyPayment(PaymenMethod paymen){
        this.paymen = paymen;
    }
    public int pay(int amount){
        return paymen.pay(amount);
    }

}
