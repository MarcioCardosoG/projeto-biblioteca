/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import dao.Conexao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projeto {
        public static void main(String args[]){
            
            Conexao conexao = new Conexao();
            
            conexao.conexaoBD();
            
            Scanner sc = new Scanner(System.in);

        List<Autor> listaAutor = new ArrayList<>();

        List<Livro> listaLivro = new ArrayList<>();
        ListaDeLivros listaDeLivros = new ListaDeLivros();

        int opcaoMenu = 1;

        while (opcaoMenu != 0) {

            System.out.println("=======================================================");
            System.out.println("1 - Cadastrar Livros");
            System.out.println("2 - Cadastrar Autores");
            System.out.println("3 - Realizar consulta sobre o catálogo de livros");
            System.out.println("4 - Realizar consulta sobre autores");
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

                    Livro livro = new Livro(codigoLivro, nomeLivro);

                    listaLivro.add(livro);
                }   }
case 2 ->           {
    System.out.println("");
    System.out.println("Quantos Autores você quer cadastrar na biblioteca?");
    int lp = sc.nextInt();
    
    for (int i = 1; i <= lp; i++) {
        System.out.println("Cadastre o " + i + "º Autor: ");
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Código do Autor: ");
        int codAutor = sc.nextInt();
        sc.nextLine();
        
        Autor autor = new Autor(codAutor, nome);
        
        listaAutor.add(autor);
        
    }   }

            case 3 ->  {

                System.out.println("");
                System.out.print("Mostrar lista de livros?(S/N)");
                char perg2 = sc.next().charAt(0);
                if (perg2 == 'S' || perg2 == 's') {
                            
                            System.out.println("");
                            System.out.println("Lista de livros: ");
                            System.out.println("");
                            System.out.println(listaLivro);
                        }
                }


            case 4 ->  {
                System.out.println("");
                System.out.println("Mostrar lista de Autores?(S/N)");
                char perg1 = sc.next().charAt(0);
                if (perg1 == 'S' ||  perg1 == 's')
                        {
                            System.out.println("");
                            System.out.println("Lista de autores:");
                            System.out.println("");
                            System.out.println(listaAutor);
                        }
                }
            }
        
    }
   }
    
}
