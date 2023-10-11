/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoo;

/**
 *
 * @author JULIA
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Peixe peixe1;
        Peixe peixe2;
        Cachorro cachorro1;
        Cachorro cachorro2;
        
        peixe1 = new Peixe ("Àgua doce", "Lambari", 0.05);
        peixe1.imprimirPeixe();
        peixe2 = new Peixe ("Àgua salgada", "Baiacu", 3);
        peixe2.imprimirPeixe();
        
        cachorro1 = new Cachorro ("Bull Terrier", "Kiro", 15);
        cachorro1.imprimirCachorro();
        cachorro2 = new Cachorro ("Spitz Alemão", "Lulu", 4);
        cachorro2.imprimirCachorro();
    }
    
}
