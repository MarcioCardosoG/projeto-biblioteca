/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author marci
 */
public class Node {
    
    	private LivrosAutor livroSalvo;
	private Node proximoNode;

    public Node(LivrosAutor livroSalvo, Node proximoNode) {
        this.livroSalvo = livroSalvo;
        this.proximoNode = proximoNode;
    }

    Node(LivrosAutor novoLivro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LivrosAutor getLivroSalvo() {
        return livroSalvo;
    }

    public void setLivroSalvo(LivrosAutor livroSalvo) {
        this.livroSalvo = livroSalvo;
    }

    public Node getProximoNode() {
        return proximoNode;
    }

    public void setProximoNode(Node proximoNode) {
        this.proximoNode = proximoNode;
    }
	
        
	
    
}
