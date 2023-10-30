import java.io.File;
import java.io.IOException;

public class ArquivoCreate {
    public static void main(String[] args) throws IOException {

        File arq = new File("C:\\Users\\JULIA\\OneDrive\\Documents\\exemplo.txt");
        arq.createNewFile(); //cria novo aquivo

        System.out.println("O arquivo ou diretório existe? " + arq.exists());
        System.out.println("É um arquivo? " + arq.isFile());
        System.out.println("É um diretório? " + arq.isDirectory());

        System.out.println("Tamanho em bytes: " + arq.length());
        System.out.println("O arquivo está disponível para leitura? " + arq.canRead());
        System.out.println("O arquivo está disponível para escrita? " + arq.canWrite());
        System.out.println("O nome do arquivo referenciado é: " + arq.getName());
        System.out.println("O caminho do arquivo referenciado é: " + arq.getPath());



    }

}

