
package projeto;

import dao.Conexao;
import java.sql.SQLException;
import java.util.Scanner;

public class Projeto {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        Conexao conexao = new Conexao();



        Scanner sc = new Scanner(System.in);

        ListaDeLivros listaDeLivros = new ListaDeLivros();

        int opcaoMenu = 1;

        while (opcaoMenu != 0) {

            System.out.println("=======================================================");
            System.out.println("1 - Cadastrar Livros");
            System.out.println("2 - Realizar consulta sobre o catálogo de livros");
            System.out.println("3 - Realizar consulta sobre autores");
            System.out.println("=======================================================");

            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {

                case 1 -> {
                    System.out.println("");
                    System.out.print("Quantos livros você quer cadastrar?");
                    int lm = sc.nextInt();

                    for (int i = 1; i <= lm; i++) {
                        System.out.println("Cadastre o " + i + "º livro: ");
                        System.out.print("Código do livro: ");
                        sc.nextLine();
                        int codigoLivro = sc.nextInt();
                        System.out.print("Título do livro:");
                        sc.nextLine();
                        String nomeLivro = sc.next();
                        System.out.println("Cadastre o autor: ");
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Código do Autor: ");
                        int codAutor = sc.nextInt();
                        sc.nextLine();

                        LivrosAutor livro = new LivrosAutor(codAutor, nome, codigoLivro, nomeLivro);
                        listaDeLivros.adicionar(livro);

                    }
                }
                case 2 -> {

                    System.out.println("");
                    System.out.print("Mostrar lista de livros?(S/N)");
                    char perg2 = sc.next().charAt(0);
                    if (perg2 == 'S' || perg2 == 's') {
                        
                        conexao.consultaLivro();
                        
                    }
                }

                case 3 -> {

                    System.out.println("");
                    System.out.print("Mostrar lista de autores?(S/N)");
                    char perg2 = sc.next().charAt(0);
                    if (perg2 == 'S' || perg2 == 's') {

                        conexao.consultaAutor();

                    }

                }

            }
        }

    }

}
