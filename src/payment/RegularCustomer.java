package payment;

public class RegularCustomer extends Customer{

    public RegularCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerinfo() {
        System.out.println("Customer Name: " + name + ", Type: Regular");
    }
}
