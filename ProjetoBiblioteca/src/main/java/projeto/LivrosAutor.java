/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author marci
 */
public class LivrosAutor {
    
    private int codigoAutor;
    private String nomeAutor;
    private int codigoLivro;
    private String nomeLivro;
    private int edicao;
    private int ano;

    public LivrosAutor(int codigoAutor, String nomeAutor, int codigoLivro, String nomeLivro) {
        this.codigoAutor = codigoAutor;
        this.nomeAutor = nomeAutor;
        this.codigoLivro = codigoLivro;
        this.nomeLivro = nomeLivro;
        this.ano = ano;
        this.edicao = edicao;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    @Override
	public String toString() {
		return "\nNome do autor: " + nomeAutor + "\nCódigo do autor: " + codigoAutor
				+ "\nNome do livro: " + nomeLivro + "\nCódigo do livro: " + codigoLivro 
                        + "\nEdição: " + edicao + "\nAno: " + ano + "\n---------------";
	}
    
    
}
