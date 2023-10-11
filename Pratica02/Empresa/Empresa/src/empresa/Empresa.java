/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author JULIA
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gerente gerente1;
        Gerente gerente2;
      
        
        gerente1 = new Gerente (1234, "Pedro", 123456789, 2500.0);
        gerente1.autentica();
        gerente1.imprimir();
        
        gerente2 = new Gerente (4321, "Roberta", 987654321, 3000.0);
        gerente2.autentica();
        gerente2.imprimir();

        
    }
    
}
