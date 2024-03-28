import java.io.FileWriter;
import java.io.IOException;

public class RelatorioAluno extends Aluno{


    public RelatorioAluno(String nomeDoUsuario, String cpf, String rg, String Curso) {
        super(nomeDoUsuario, cpf, rg, Curso);
    }

    public static void escreverNoArquivoCsv(int NumeroDaMatricula) {

        int LocalInfo = NumeroDaMatricula - 1;

        try {
            FileWriter arquivo = new FileWriter("RelatorioAluno_"+ NumeroDaMatricula +".csv",true);
            arquivo.write("Nome da Disciplina" + "," + "Código da Disciplina" + "," + "Número da Matrícula" + "," + "Nota");
            if (alunos.get(LocalInfo).getCurso() == "Ciência da Computação" ){
                arquivo.write("ddd");
            }

            for (int i = 0; i<10;i++) {
                arquivo.write("\n"+i +"," + "h");
            }
            arquivo.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
