package strategy;

public class Cashpayement implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("The payment is completed in Cash");
    }
}
