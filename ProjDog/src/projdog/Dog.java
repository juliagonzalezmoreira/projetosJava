/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projdog;

public class Dog {
    private String nome;
    private int peso;
     //torna a variável privada
    
    public String getNome() {
        return nome;
     }
    
    public int getPeso() {
        return peso;
    }
    
    public void setNome(String n) {
        nome=n;
    }
    
    public void setPeso(int p){
        peso=p;
    }
    
    void latir() {
    if (peso >= 9){
        System.out.println("AUUUUU!");
    } else if (peso < 9){
        System.out.println("AU!");
    }
  }
}

