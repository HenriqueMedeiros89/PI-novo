/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author henrique.medeiros
 */
public class Filme extends Item {

    private String Diretor;
    private int Duracao;

    public Filme(Categoria categoria) {
        super(categoria);
    }

    /**
     * @return the Diretor
     */
    public String getDiretor() {
        return Diretor;
    }

    /**
     * @param Diretor the Diretor to set
     */
    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }

    /**
     * @return the Duracao
     */
    public int getDuracao() {
        return Duracao;
    }

    /**
     * @param Duracao the Duracao to set
     */
    public void setDuracao(int Duracao) {
        this.Duracao = Duracao;
    }

    @Override

    public String toString() {
        return "Filme \n"
                + "ID: " + getId() + "\n"
                + "Diretor: " + getDiretor() + "\n"
                + "Duração: " + getDuracao() + "\n"
                + "Titulo: " + getTitulo() + "\n"
                + "Descrição: " + getDescricao() + "\n"
                + "Preço: " + getPreco() + "\n"
                + "Numero Dias: " + getNumeroDias() + "\n"
                + "Categoria: " + getCategoria() + "\n"
                + '}';

    }

}
