/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2_220441100017_indra.kurniawan;

import com.mysql.jdbc.Connection;
//import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author LENOVO SLIM 3 R3
 */
public class Koneksi {
    private static Connection mysqlconnect;
    public static Connection koneksiDB() throws SQLException{
        try{
            String db = "jdbc:mysql://localhost:3306/dbbayarlistrik";
            String user = "root";
            String pw  = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconnect = (Connection) DriverManager.getConnection(db, user, pw);
            //JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e){
             JOptionPane.showMessageDialog(null, "Koneksi Gagal" + e.getMessage());
            
    }
        return mysqlconnect;
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            java.sql.Connection conn = koneksiDB();
            if (conn != null){
                System.out.println("Koneksi Berhasil");
            }else{
                System.out.println("Koneksi Gagal");
            }
          
        }catch (Exception e){
            System.out.println("Terjadi kesalahan"   );
        }
        
    }
}