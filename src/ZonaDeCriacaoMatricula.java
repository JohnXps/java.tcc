import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZonaDeCriacaoMatricula extends Aluno {



    public static void  Criar_Matricula() throws IOException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDigite o seu nome completo: ");
        String nome = leitor.next();

        System.out.println("\nDigite o seu CPF: ");
        String cpf = leitor.next();

        System.out.println("\nDigite o seu RG: ");
        String rg = leitor.next();

        System.out.println(
                "\nDigite o número correspondente com o seu curso desejado: " +
                        "\n1 = Ciência da Computação " +
                        "\n2 = Engenharia da Computação " +
                        "\n3 = Engenharia de Software " +
                        "\n4 = Análise e Desenvolvimento de Sistemas: Full-Stack e Mobile " +
                        "\n5 = Banco de Dados: Ênfase em Data Analytics " +
                        "\n6 = TI – Sistemas de Informação\n"
        );
        int NumeroCurso = leitor.nextInt();


        while (NumeroCurso < 1 || NumeroCurso > 6) {

            System.out.println(
                    "\nEste número não é corresponde com os cursos da PUCRS! " +
                            "\nDigite o número correspondente com o curso desejado: " +
                            "\n1 = Ciência da Computação " +
                            "\n2 = Engenharia da Computação " +
                            "\n3 = Engenharia de Software " +
                            "\n4 = Análise e Desenvolvimento de Sistemas: Full-Stack e Mobile " +
                            "\n5 = Banco de Dados: Ênfase em Data Analytics " +
                            "\n6 = TI – Sistemas de Informação\n"


            );
            NumeroCurso = leitor.nextInt();
        }

        String CaseCurso=null;
        switch (NumeroCurso) {
            case 1:
                CaseCurso = "Ciência da Computação";
                break;
            case 2:
                CaseCurso = "Engenharia da Computação";
                break;
            case 3:
                CaseCurso = "Engenharia de Software";
                break;
            case 4:
                CaseCurso = "Análise e Desenvolvimento de Sistemas: Full-Stack e Mobile";
                break;
            case 5:
                CaseCurso = "Banco de Dados: Ênfase em Data Analytics";
                break;
            case 6:
                CaseCurso = "TI – Sistemas de Informação";
                break;

        }

        String curso = CaseCurso;




        Aluno aluno = new Aluno();

        aluno.setTudo(nome, cpf, rg, curso);


        System.out.print("Agora vamos escolher as disciplinas de " + curso + " que estão disponíveis");

        if (aluno.getLevelDisciplinas() == 1){
            System.out.println(
                    "\nAs disciplinas disponíveis para iniciar o curso de " + aluno.getCurso() +", são: " +
                    "\n1 = Fundamentos da Computação" +
                    "\n2 = Estruturas de Dados e Algoritmos" +
                    "\n3 = Teoria da Computação" +
                    "\n4 = Lógica Digital e Circuitos" +
                    "\n5 = Arquitetura de Sistemas Computacionais\n" +
                    "Obs.: Você só vai desbloquear as outras diciplinas, se tiver uma medía 7 anual e 6.5 em cada disciplina."
            );




            //diciplinas.add("dd");

        }






        String NM = String.valueOf(aluno.getNumeroDaMatricula());

        File arquivo = new File(NM + ".txt");
        FileWriter inserindo = new FileWriter(arquivo, true);
        inserindo.write("Seja bem vindo(a)," + aluno.getNomeDoUsuario() + "!\n");
        inserindo.write("Conheça todo ecossistema PUCRS, através deste link: https://www.pucrs.br/" + "\n");
        inserindo.write("Esperamos você na maior universidade privada do Brasil!" + "\n");
        inserindo.close();

        alunos.add(aluno);
        System.out.println(alunos.get(0));


    }



}
