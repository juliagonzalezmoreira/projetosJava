import java.io.*;

public class ArquivoWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\JULIA\\OneDrive\\Documents\\exemplo.txt");
            BufferedWriter escrita = new BufferedWriter( fw );

            escrita.write("Frase Um");
            escrita.flush();

            FileReader fr = new FileReader("C:\\Users\\JULIA\\OneDrive\\Documents\\exemplo.txt");
            BufferedReader leitor = new BufferedReader(fr);

            String linha;

            do {
                linha = leitor.readLine(); // primeira linha
                if (linha != null) {
                    System.out.println(linha);
                }
            } while (linha!=null); {

                escrita.newLine();
                escrita.write("Frase Dois");

                leitor.close();
                escrita.close();
            }

        } catch (IOException ex){
            System.out.println("Problemas ao abrir o arquivo.");
        }
    }
}

