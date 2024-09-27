package strategy;

public class Cardpayement implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("The payment is completed in Credit card");
    }
}
