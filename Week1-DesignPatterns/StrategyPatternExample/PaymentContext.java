package StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void setPaymentStrategy(
            PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
