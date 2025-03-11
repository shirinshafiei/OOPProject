package payment;

public class PremiumCustomer extends Customer {

    public PremiumCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerinfo() {
        System.out.println("Customer: " + name + ", Type: Premium");
    }

}
