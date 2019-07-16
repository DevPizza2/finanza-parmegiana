package br.com.devpizza.finanzaparmegiana.Model;

public class Despesa {
    float valor;
    String nome;
    String descricao;
    int duracao;

    public Despesa() {
    }

    public Despesa(float valor, String nome, String descricao, int duracao) {
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
