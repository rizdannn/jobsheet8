import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        int totalPelanggan = 0;
        int totalItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n- - - Cabang " + i + " - - -");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            totalPelanggan += jumlahPelanggan;
            int totalItemCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print(" - Pelanggan " + j + " memesan beberapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            totalItem += totalItemCabang;

            System.out.println("Cabang " + i + ": " );
            System.out.println("- Pelanggan : " + totalPelanggan + " orang");
            System.out.println("- Item terjual : " + totalItem);
        }

        System.out.println("\nTotal seluruh cabang: ");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " Item");

    }
}
