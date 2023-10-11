/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package folha;

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
        Mensalista men1;
        Horista hora1;
        
        //Empregado Mensalista
        men1= new Mensalista ("Junior", "José", "Rua 7 de Setembro", 0.0);
        men1.cal_Salario();
        men1.cal_Inss();
        men1.imprimir();
        
        //Empregado Horista
        hora1= new Horista (100.0, "Cristiane", "Rua do Centro", 0.0);
        hora1.cal_Salario();
        hora1.cal_Inss();
        hora1.imprimir();
               
    }
    
}
