// Customer dengan enkapsulasi dan rename method
public class Customer {
    private String customerName; // Encapsulate Field

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void greet() { // Rename dari sayHello()
        System.out.println("Selamat datang, " + customerName + "!");
    }
}
