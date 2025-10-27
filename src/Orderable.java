// EXTRACT INTERFACE: Menjamin semua pesanan bisa dihitung dan ditampilkan
public interface Orderable {
    void calculateTotal();   // Setiap pesanan bisa dihitung totalnya
    void printReceipt();     // Setiap pesanan bisa cetak struk
}
