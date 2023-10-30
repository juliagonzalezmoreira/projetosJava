import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoReader {
    public static void main(String[] args) {

        File arq = new File("C:\\Users\\JULIA\\OneDrive - Fatec Centro Paula Souza\\2 SEM\\LP\\Pratica01 - Julia e Dianne.txt");

        try {
            FileReader fr = new FileReader(arq);
            BufferedReader leitor = new BufferedReader(fr);

            String linha;

            do {
                linha = leitor.readLine(); // primeira linha
                if (linha != null) {
                    System.out.println(linha);
                }
            } while (linha!=null); {
                    leitor.close();
                }

        } catch (IOException ex){
            System.out.println("Problemas ao abrir o arquivo.");
        }
    }
}
