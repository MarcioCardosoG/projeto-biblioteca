/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author marci
 */
public class ListaDeLivros {
    
    private Node primeiro;
    private Node ultimo;
    private int tamanhoLista;
    
    public ListaDeLivros() {
        this.tamanhoLista = 0;
    }
    
    public Node getPrimeiro() {
		return primeiro;
	}


	public void setPrimeiro(Node primeiro) {
		this.primeiro = primeiro;
	}



	public Node getUltimo() {
		return ultimo;
	}



	public void setUltimo(Node ultimo) {
		this.ultimo = ultimo;
	}
	
	


	public int getTamanhoLista() {
		return tamanhoLista;
	}


	public void setTamanhoLista(int tamanhoLista) {
		this.tamanhoLista = tamanhoLista;
	}



	public void adicionar(LivrosAutor novoLivro) {
		Node novoNode = new Node(novoLivro);
		if(this.primeiro == null && this.ultimo == null ) {
			this.primeiro = novoNode;
			this.ultimo = novoNode;
					
		}else {
			this.ultimo.setProximoNode(novoNode);
			this.ultimo = novoNode;
		}
		this.tamanhoLista++;
	}
	

    @SuppressWarnings("empty-statement")
	public Node Get(int posicao) {
		Node atual = this.primeiro;
		for(int i=0; i<posicao; i++ );
			if(atual.getProximoNode()!=null) {
				atual = atual.getProximoNode();
			}
			return atual;
	}
    
}
