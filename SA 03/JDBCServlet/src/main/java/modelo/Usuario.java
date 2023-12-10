package modelo;

public class Usuario {
    protected int codigo;
    protected String nome;
    protected String email;
    protected String pais;
    protected String endereco;
    protected String modalidade;

    public Usuario() {
    }

    public Usuario(String nome, String email, String pais, String endereco, String modalidade) {
        super();
        this.nome = nome;
        this.email = email;
        this.pais = pais;
        this.endereco = endereco;
        this.modalidade = modalidade;
    }

    public Usuario(int codigo, String nome, String email, String pais, String endereco, String modalidade) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.pais = pais;
        this.endereco = endereco;
        this.modalidade = modalidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
}
