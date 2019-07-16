package br.com.devpizza.finanzaparmegiana.Model;

public class RendaFixa extends Entrada {
    int duracao;

    public RendaFixa(float valor, String nome, String descricao, int duracao) {
        super(valor, nome, descricao);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
