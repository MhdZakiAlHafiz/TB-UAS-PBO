import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String y = "true";
        Integer hargabarang = 0;
        Integer jumlahbeli = 0;

        // Menyiapkan list untuk jenis pembayaran
        List<String> metodePembayaran = new ArrayList<>();
        metodePembayaran.add("Cash");
        metodePembayaran.add("Cashless");
        

        // Menampilkan jenis pembayaran yang tersedia
        System.out.println("Metode Pembayaran yang Tersedia:");
        for (int i = 0; i < metodePembayaran.size(); i++) {
            System.out.println((i + 1) + ". " + metodePembayaran.get(i));
        }

        //creat
        Scanner scanNEW = new Scanner(System.in);
        newDataObat.insertEmployeeData(scanNEW);
        System.out.println("");

        //uodate
        Scanner scanner = new Scanner(System.in);
        updateObat.updateEmployeeCredentials(scanner);
        System.out.println("");

        //rm
        RmObat.deleteEmployeeById();
        System.out.println("");

        System.out.println("-------------------------");
        System.out.println("Daftar obat yang tersedia di Apotik Bismillah");

        showDb see = new showDb();

        while (y.equals("true")) {
            boolean input = false;
            Scanner custom = new Scanner(System.in);
            Scanner number = new Scanner(System.in);
            System.out.println("-------------------------");
            System.out.print("Nama Pelanggan : ");
            String nama = custom.nextLine();
            System.out.print("Alamat         : ");
            String alamat = custom.nextLine();
            System.out.print("Nama Barang    : ");
            String namabarang = custom.nextLine();
            System.out.print("Kasir          : ");
            String kasir = custom.nextLine();
            do {
                try {
                    System.out.print("Harga Barang   : " + hargabarang);
                    hargabarang = number.nextInt();
                    input = true;
                } catch (InputMismatchException e) {
                    System.out.print("Input dengan bilangan bulat ");
                    number.nextLine();
                }
            } while (!input);
            input = false;
            do {
                try {
                    System.out.print("Jumlah Barang  : ");
                    jumlahbeli = number.nextInt();
                    input = true;
                } catch (InputMismatchException e) {
                    System.out.print("Input dengan bilangan bulat ");
                    number.next();
                }
            } while (!input);

            // Memilih metode pembayaran
            System.out.println("Pilih Metode Pembayaran:");
            for (int i = 0; i < metodePembayaran.size(); i++) {
                System.out.println((i + 1) + ". " + metodePembayaran.get(i));
            }
            System.out.print("Pembayaran Pelanggan: ");
            int pilihan = number.nextInt();
            String metode = metodePembayaran.get(pilihan - 1);

            penjualan mart = new penjualan(nama, alamat, namabarang, kasir, hargabarang, jumlahbeli);

            Scanner on = new Scanner(System.in);
            System.out.println();
            System.out.println("ketika 'true' untuk menambah");
            y = on.next();
        }
    }
}
