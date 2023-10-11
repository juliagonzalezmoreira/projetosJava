/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aumento;

/**
 *
 * @author JULIA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario;
        
        funcionario = new Funcionario (1000.00, 0.10, "Maria", "62785964");
        funcionario.aumentar_Salario();
        funcionario.imprimir();
    }
    
}
