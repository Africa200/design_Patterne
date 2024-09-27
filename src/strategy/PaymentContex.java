package strategy;

public class PaymentContex {

    PayStrategy payStrategy;

    public PaymentContex(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    void executePayment(){
        payStrategy.pay();
    }
}
