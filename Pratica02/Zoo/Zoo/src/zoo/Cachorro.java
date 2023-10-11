/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author JULIA
 */
public class Cachorro extends Animal {
    
    private String raca;

    public Cachorro(String raca, String nome, double peso) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
        public void imprimirCachorro(){
        System.out.println("Nome do cachorro: " + nome);
        System.out.println("Peso do cachorro: " + peso);
        System.out.println("Raça do cachorro: " + raca);
        System.out.println("---------------------------------");
    }
}
