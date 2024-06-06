package br.cesul.Contact;

public class PersonalContact extends Contact {

    private final String nickname;

    public PersonalContact(String nome, String telefone, String email, String endereco, String instagram, String apelido) {
        super(nome, telefone, email, endereco, instagram);
        this.nickname = apelido;
    }

    public String getNickname() {
        return nickname;
    }
}
