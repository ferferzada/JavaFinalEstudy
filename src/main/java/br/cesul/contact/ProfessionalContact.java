package br.cesul.contact;

public class ProfessionalContact extends Contact {
    private final String empresa;

    private String telefoneComercial;

    private String Linkeind;

   private  String Profissao;

   private  String setor;

    public ProfessionalContact(String nome, String telefone, String email, String endereco, String instagram, String empresa, String telefoneComercial, String linkeind, String profissao, String setor) {
        super(nome, telefone, email, endereco, instagram);
        this.empresa = empresa;
        this.telefoneComercial = telefoneComercial;
        Linkeind = linkeind;
        Profissao = profissao;
        this.setor = setor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public String getLinkeind() {
        return Linkeind;
    }

    public String getProfissao() {
        return Profissao;
    }

    public String getSetor() {
        return setor;
    }
}
