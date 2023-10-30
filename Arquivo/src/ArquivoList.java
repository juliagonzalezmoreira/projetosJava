import java.io.File;

public class ArquivoList {
    public static void main(String[] args) {
        File arq = new File("C:\\Users\\JULIA\\OneDrive - Fatec Centro Paula Souza\\2 SEM");
        String[] vet_arquivos = arq.list();

        if (vet_arquivos != null){
            for (int i=0; i < vet_arquivos.length; i++){
                System.out.println((i+1) + "° arquivo " + vet_arquivos[i]);
            }
        }

    }
}
