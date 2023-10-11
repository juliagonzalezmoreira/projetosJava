/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import javax.swing.JOptionPane;

/**
 *
 * @author JULIA
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String n1 = JOptionPane.showInputDialog("Digite um número:");
        String n2 = JOptionPane.showInputDialog("Digite outro número:");
        int number1 = Integer.parseInt(n1);
        int number2 = Integer.parseInt(n2);
                
        StringBuilder sb= new StringBuilder();
        sb.append("Soma: ");
        int soma = number1 + number2;
        sb.append(soma);
        JOptionPane.showMessageDialog(null, sb.toString());
        
    }
    
}
