package strategy;

public class strategy_Main {
    public static void main(String[] args) {
        PayStrategy payStrategy=new Cardpayement();
        PaymentContex paymentContex=new PaymentContex(payStrategy);
        paymentContex.executePayment();
    }
}
