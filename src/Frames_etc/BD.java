package Frames_etc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BD {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mercadinho";
    private static final String USER = "root";
    private static final String PASS = "1234";

    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão: "+ex.toString());
            System.exit(0);
        }
        return null;
    }
    public static void close(Connection con) { 
	try {
            con.close();
	} catch (SQLException e) {}
    }
}
