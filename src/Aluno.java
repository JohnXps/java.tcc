import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Scanner;


public class Aluno extends Pessoa{
    static int RunNumeroDaMatricula = -1; //número atual de matrículas
    private int NumeroDaMatricula;
    private String Curso;
    private int LevelDisciplinas;
    private int NumeroDisciplinas;
    static ArrayList<Aluno> alunos = new ArrayList<>();


    public int getNumeroDaMatricula() {
        return NumeroDaMatricula;
    }

    public void setNumeroDaMatricula(int numeroDaMatricula) {
        NumeroDaMatricula = numeroDaMatricula;
    }

    public static int getRunNumeroDaMatricula() {
        return RunNumeroDaMatricula;
    }

    public static void setRunNumeroDaMatricula(int runNumeroDaMatricula) {
        RunNumeroDaMatricula = runNumeroDaMatricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public int getLevelDisciplinas() {
        return LevelDisciplinas;
    }

    public void setLevelDisciplinas(int levelDisciplinas) {
        LevelDisciplinas = levelDisciplinas;
    }

    public int getNumeroDisciplinas() {
        return NumeroDisciplinas;
    }

    public void setNumeroDisciplinas(int numeroDisciplinas) {
        NumeroDisciplinas = numeroDisciplinas;
    }

    public Aluno(){
        this.NumeroDaMatricula = getRunNumeroDaMatricula() + 1;
        this.RunNumeroDaMatricula = getRunNumeroDaMatricula() + 1;
        this.LevelDisciplinas = 1;
    }
public void setTudo(String nomeDoUsuario, String cpf, String rg, String Curso){
    this.setNomeDoUsuario(nomeDoUsuario);
    this.setCpf(cpf);
    this.setRg(rg);
    this.Curso = Curso;

}

//    public Aluno(String nomeDoUsuario, String cpf, String rg, String Curso) {
//
//        this.setNomeDoUsuario(nomeDoUsuario);
//        this.setCpf(cpf);
//        this.setRg(rg);
//        this.LevelDisciplinas = 1;
//        this.NumeroDaMatricula = getRunNumeroDaMatricula() + 1;
//        RunNumeroDaMatricula = getRunNumeroDaMatricula() + 1;
//        this.Curso = Curso;
//
//
//    }

    @Override
    public String toString() {
        return "\nNome: " + super.getNomeDoUsuario() + "\nCPF: " + super.getCpf() + "\nRG: " + super.getRg() + "\nNúmero da Matrícula: " + this.getNumeroDaMatricula() + "\nCurso: " +  this.getCurso();
    }











}
