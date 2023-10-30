import java.io.File;

public class Arquivo1 {
    public static void main(String[] args) {

        char c = File.separatorChar;

        System.out.println("Separator: " + c);

        File arq = new File("C:\\Users\\JULIA\\OneDrive\\Documents\\text.txt");

        System.out.println("O arquivo ou diretório existe? " + arq.exists());
        System.out.println("É um arquivo? " + arq.isFile());
        System.out.println("É um diretório? " + arq.isDirectory());

    }
}

