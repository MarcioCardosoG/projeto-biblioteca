
package projeto;



import java.sql.SQLException;
import java.util.Scanner;

public class Projeto {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        

        


        Conexao con = new Conexao();

        Scanner sc = new Scanner(System.in);



        int opcaoMenu = 1;

        while (opcaoMenu != 0) {

            System.out.println("=======================================================");
            System.out.println("1 - Realizar consulta sobre o catálogo de livros em ordem alfabética");
            System.out.println("0 - Finalizar programa");
            System.out.println("=======================================================");

            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {

                case 1 -> {
                   
                   con.consultaLivro();
                    
                    
                }
                case 2 -> {
                    System.exit(0);


                }



            }
        }

    }

}
