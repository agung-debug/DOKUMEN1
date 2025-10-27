// Program Utama
public class MainApp {
    public static void main(String[] args) {

        // Membuat Pelanggan
        Customer customer = new Customer("Agung");
        customer.greet();

        // Membuat Pesanan Kayu
        Material order = new Material("Kayu Jati ", 100000, 2);

        System.out.println("\n--- Menu Dipesan ---");
        order.displayInfo();

        // Cetak Struk
        order.printReceipt();
    }
}
