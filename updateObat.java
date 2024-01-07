import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class updateObat {
    // Driver
    private static final String URL = "jdbc:mysql://localhost:3306/tokoobat";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void updateEmployeeCredentials(Scanner scanner) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "UPDATE dataobat SET namaObat = ?, harga = ? WHERE idObat = ? ";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("----UPDATE DATA OBAT YANG TERSEDIA----");
                System.out.print("ID Obat       :");
                String idobat = scanner.next();

                System.out.print("Nama Obat     :");
                String namaobat = scanner.next();

                System.out.print("Harga Obat    :Rp ");
                Integer harga = scanner.nextInt();

                preparedStatement.setString(1, namaobat); // Perubahan disini, pertukaran antara kolom namaObat dan harga
                preparedStatement.setInt(2, harga);      // karena idObat yang pertama kali diperlukan untuk WHERE clause
                preparedStatement.setString(3, idobat);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data obat berhasil diperbarui!");
                } else {
                    System.out.println("Tidak ditemukan data obat dengan ID tersebut");
                }
            }
        } catch (SQLException e) {
            // e.printStackTrace();
        }
    }
}
