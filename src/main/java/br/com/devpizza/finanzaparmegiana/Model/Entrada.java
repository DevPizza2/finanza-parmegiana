package br.com.devpizza.finanzaparmegiana.Model;

public class Entrada {
    float valor;
    String nome;
    String descricao;

    public Entrada() {
    }

    public Entrada(float valor, String nome, String descricao) {
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
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
}
