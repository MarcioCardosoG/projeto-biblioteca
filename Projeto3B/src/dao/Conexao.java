
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    
    public Connection conexaoBD (){
        
        Connection conexao = null;
        
        try {
            String url = "jdbc:mysql://localhost:5432/banco?user=postgres&password=postgres";
            conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conexao;
        
    }
    
}
