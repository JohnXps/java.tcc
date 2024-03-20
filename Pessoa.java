

public class Pessoa {

    private String nomeDoUsuario;
    private String cpf;
    private String rg;
    private int escolaridade;

    //---------------------------------------------------
    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    //--------------------------------------------------

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //---------------------------------------------------

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    //-------------------------------------------------------

    public int getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(int escolaridade) {
        this.escolaridade = escolaridade;
    }

    //------------------------------------------------------



    //=======================CONSTRUCTOR-PESSOA=========================

    public Pessoa(String nomeDoUsuario, String cpf, String rg ){
        this.nomeDoUsuario = nomeDoUsuario;
        this.cpf = cpf;
        this.rg = rg;

    }








}
