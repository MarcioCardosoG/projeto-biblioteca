
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    
    public Connection conexaoBD (){
        
        Connection conexao = null;
        
        String url = "jdbc:mysql://localhost:5432/banco?user=postgres&password=postgres";
        
        try {
            
            conexao = DriverManager.getConnection(url);
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return conexao;
        
    }
    
}
