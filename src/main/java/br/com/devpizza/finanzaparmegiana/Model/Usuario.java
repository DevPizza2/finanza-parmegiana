package br.com.devpizza.finanzaparmegiana.Model;

public class Usuario {
    String nome;
    int idade;
    String email;
    int id;

    public Usuario() {
    }

    public Usuario(String nome, int idade, String email, int id) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
