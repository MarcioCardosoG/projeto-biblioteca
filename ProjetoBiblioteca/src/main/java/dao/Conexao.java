
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {

    public Connection consultaLivro() throws ClassNotFoundException, SQLException {

        Connection conexao = null;
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/banco","postgre", "");
            ResultSet rsLivro = conexao.createStatement().executeQuery("SELECT * FROM livro");
            while (rsLivro.next()) {
                System.out.println("Nome: " + rsLivro.getString("nomeLivro"));
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Driver não localizado.");

        } catch (SQLException e) {
            System.out.println("Falha na conexão.");

        } finally {
            if (conexao != null) {
                conexao.close();
            }

        }
        return null;

    }
    
        public Connection consultaAutor() throws ClassNotFoundException, SQLException {

        Connection conexao = null;
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/banco","postgre", "");
            ResultSet rsAutor = conexao.createStatement().executeQuery("SELECT * FROM autor");
            while (rsAutor.next()) {
                System.out.println("Nome: " + rsAutor.getString("nome"));
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Driver não localizado.");

        } catch (SQLException e) {
            System.out.println("Falha na conexão.");

        } finally {
            if (conexao != null) {
                conexao.close();
            }

        }
        return null;

    }

    public Object createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
