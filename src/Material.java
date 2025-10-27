// Coffee: turunan dari Beverage + Implement Orderable
public class Material extends Beverage implements Orderable {

    private int quantity; // Encapsulate Field

    // Introduce Constant: Diskon pelanggan spesial
    private static final double DISCOUNT_RATE = 0.1;

    // Constructor
    public Material(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    // Extract Method: Hitung harga tanpa campur dengan struk
    private double calculateSubtotal() {
        return price * quantity;
    }

    // Implement calculateTotal dari interface
    @Override
    public void calculateTotal() {
        double subtotal = calculateSubtotal();
        double discount = subtotal * DISCOUNT_RATE; // Inline sudah diterapkan
        double total = subtotal - discount;

        System.out.println("Subtotal     : Rp " + subtotal);
        System.out.println("Diskon 10%   : Rp " + discount);
        System.out.println("Total Akhir  : Rp " + total);
    }

    // Print struk pesanan
    @Override
    public void printReceipt() {
        System.out.println("\n=== STRUK PEMBELIAN KOPI ===");
        System.out.println("Menu   : " + name);
        System.out.println("Harga  : Rp " + price);
        System.out.println("Jumlah : " + quantity);
        calculateTotal(); // Call Extract Method
        System.out.println("=============================");
    }

    // Tampil info kopi
    @Override
    public void displayInfo() {
        System.out.println(name + " - Rp " + price + " x " + quantity);
    }
}
