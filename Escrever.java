import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escrever {
    public void escreveTexto() throws IOException {
        File arquivo = new File("arquivo.txt");
        FileWriter inserindo = new FileWriter(arquivo, true);
        inserindo.write("1. Mario"+"\n");
        inserindo.write("2. Luigi"+"\n");
        inserindo.write("3. Jose"+"\n");
        inserindo.write("4. Pedro"+"\n");
        inserindo.write("5. Francisco");
        inserindo.close();

    }
}
