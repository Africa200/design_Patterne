package strategy;

public class PayPalPayement implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("The payment is completed in PayPal");
    }
}
