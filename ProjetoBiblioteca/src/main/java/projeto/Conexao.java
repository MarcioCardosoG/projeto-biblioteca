
package projeto;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {
    
    private Connection conexao;
    
        //public Connection conexaoBD() throws ClassNotFoundException, SQLException {
        Conexao(){
        

        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "postgres");
            System.out.println("Conectado!");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Driver não localizado.");

        } catch (Exception e) {
            e.printStackTrace();

        }


    }

    public Connection consultaLivro() throws ClassNotFoundException, SQLException {


        

        try {
           
            ResultSet rsLivro = conexao.createStatement().executeQuery("select * from livro order by nomelivro asc");
            while (rsLivro.next()) {
                System.out.println("Título do livro: " + rsLivro.getString("nomelivro"));
                System.out.println("Código do livro: " + rsLivro.getString("codigolivro"));
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            
                conexao.close();
            

        }
        return null;

    }
    


    public Object createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
