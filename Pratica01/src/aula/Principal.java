/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula;


import javax.swing.JOptionPane; //para input
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
        // EXERCÍCIO 1
        /*for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        
        // EXERCÍCIO 2
        int i = 1;
        while (i <=5){
            System.out.println(i);
            i++;
        } 
        
        // EXERCÍCIO 3
        int i =1;
        do {
            System.out.println(i);
             i++;
        }
        while (i <=5);
        
        //EXERCÍCIO 4
        for (int i = 1; i<=15; i++){
            if (i%2 == 0){
            System.out.println(i);
            }
        }
        
        // EXERCÍCIO 5
        int s = 0;
        for (int i = 0; i <= 10; i++){
            s = s + i;
        }
         System.out.println(s);
        
        // EXERCÍCIO 6
        int soma = 0;
        int rep = 0;
        for (int i = 0; i <= 100; i++){
        if (i%2 != 0){
        soma = soma + i;
        rep++; 
        }        
      }
        System.out.println((float)soma/rep); */
        
        // EXERCÍCIO 7
        String nome = JOptionPane.showInputDialog("Nome:");
        if (nome.equals("") == false){
            System.out.println(nome);
            }
        //EXERCÍCIO 8
        
        String number = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numberInt = Integer.parseInt(number);
        if (numberInt % 2 == 0){
            System.out.printf("O numero %d e par", numberInt);
            }
        else {
            System.out.printf("O numero %d e impar", numberInt );
        }
        
        
        
        
   }
        
}
    

