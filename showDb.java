import java.sql.*;

public class showDb {
    public showDb(){
        try {
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/tokoobat", "root", "");
            Statement mydb = db.createStatement();
            ResultSet myrs = mydb.executeQuery("select * FROM dataobat");

            while (myrs.next()) {
                System.out.println(myrs.getString("idObat") +", "+myrs.getString("namaObat")+", "+myrs.getInt("harga"));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
