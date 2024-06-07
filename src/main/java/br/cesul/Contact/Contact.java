package br.cesul.Contact;

public abstract class Contact {

    private final String nome;
    private final String email;
    private final String Instagram;
    private  String telefone;
    private  String endereco;
    public Contact(String nome, String telefone, String email, String endereco, String instagram) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        Instagram = instagram;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getInstagram() {
        return Instagram;
    }
}
