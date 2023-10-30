import javax.swing.*;
import java.io.File;

public class ArquivoChooser {
    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory( new File("C:\\Users\\JULIA\\OneDrive\\Documents\\"));

        try {
            int resp = fc.showOpenDialog(null);
            if (resp == JFileChooser.APPROVE_OPTION){
                File file = fc.getSelectedFile();
                System.out.println("Arquivo: " + file.getName());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
