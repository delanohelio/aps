package model;

public class Usuario {
    private String nome;
    private String perfil; // Ex: "ADMIN" ou "USUARIO"

    public Usuario(String nome, String perfil) {
        this.nome = nome;
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public String getPerfil() {
        return perfil;
    }
}