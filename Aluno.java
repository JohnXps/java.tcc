

public class Aluno extends Pessoa{
    static int NumeroDaMatricula;
    private String Curso;

    public int getNumeroDaMatricula() {
        return NumeroDaMatricula;
    }

    public void setNumeroDaMatricula(int numeroDaMatricula) {
        NumeroDaMatricula = numeroDaMatricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }





    public Aluno(String nomeDoUsuario, String cpf, String rg, String Curso) {
        super(nomeDoUsuario, cpf, rg);
        this.NumeroDaMatricula = this.getNumeroDaMatricula() + 1;
        this.Curso = Curso;


    }

    @Override
    public String toString() {
        return "\nNome: " + super.getNomeDoUsuario() + "\nCPF: " + super.getCpf() + "\nRG: " + super.getRg() + "\nNúmero da Matrícula: " + this.getNumeroDaMatricula() + "\nCurso: " +  this.Curso;
    }

















}
