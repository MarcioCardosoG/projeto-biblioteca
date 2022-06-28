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
    
    	private Livro livroSalvo;
	private Node proximoNode;
	
	public Node(Consulta novaConsulta) {
		this.consultaMarcada = novaConsulta;
	}
	
	public Consulta getConsultaMarcada() {
		return consultaMarcada;
	}
	public void setConsultaMarcada(Consulta consultaMarcada) {
		this.consultaMarcada = consultaMarcada;
	}
	public Node getProximoNode() {
		return proximoNode;
	}
	public void setProximoNode(Node proximoNode) {
		this.proximoNode = proximoNode;
	}
	
    
}
