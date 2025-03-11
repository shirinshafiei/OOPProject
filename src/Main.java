import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regCustomer = new RegularCustomer("Shirin");
        PremiumCustomer premCustomer = new PremiumCustomer("Shayan");
        PremiumCustomer premCustomer2 = new PremiumCustomer("Elena");

        PaymentStrategy creditCard = new CreditCardPayment("6037-9917-6869-7835", "Shirin");
        PaymentStrategy paypal = new PayPalPayment("Shayan@example.com");
        PaymentStrategy bitcoin = new BitcoinPayment("1A2B3C4D");

        regCustomer.displayCustomerinfo();
        premCustomer.displayCustomerinfo();
        premCustomer2.displayCustomerinfo();

        regCustomer.makePayment(creditCard, 100.0);
        premCustomer.makePayment(paypal, 200.0);
        regCustomer.makePayment(bitcoin, 50.0);
        premCustomer.makePayment(creditCard, 150.0);
        premCustomer2.makePayment(bitcoin, 150.0);
        premCustomer2.makePayment(paypal, 300.0);

        regCustomer.showPaymentHistory();
        premCustomer.showPaymentHistory();
        premCustomer2.showPaymentHistory();
    }
}