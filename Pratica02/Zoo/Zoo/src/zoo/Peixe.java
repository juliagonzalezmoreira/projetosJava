/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author JULIA
 */
public class Peixe extends Animal {
    
    private String tipoHabitat;

    public Peixe(String tipoHabitat, String nome, double peso) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    
    public void imprimirPeixe(){
        System.out.println("Nome do peixe: " + nome);
        System.out.println("Peso do peixe (em quilo): " + peso);
        System.out.println("Habitat do peixe: " + tipoHabitat);
        System.out.println("---------------------------------");
    }
}
