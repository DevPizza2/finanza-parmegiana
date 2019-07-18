package br.com.devpizza.finanzaparmegiana.Model;

import javax.persistence.*;

@Entity
@Table(name = "entrada")
public class Entrada {
    float valor;
    String nome;
    String descricao;
    int duracao;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    Usuario usuario;

    public Entrada(float valor, String nome, String descricao, int duracao, Usuario usuario) {
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.usuario = usuario;
    }

    public Entrada() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
