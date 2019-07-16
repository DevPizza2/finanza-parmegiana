package br.com.devpizza.finanzaparmegiana.Model;

public class Variavel extends Despesa{
    float valorEsperado;

    public Variavel(float valor, String nome, String descricao, int duracao, float valorEsperado) {
        super(valor, nome, descricao, duracao);
        this.valorEsperado = valorEsperado;
    }

    public float getValorEsperado() {
        return valorEsperado;
    }

    public void setValorEsperado(float valorEsperado) {
        this.valorEsperado = valorEsperado;
    }
}
