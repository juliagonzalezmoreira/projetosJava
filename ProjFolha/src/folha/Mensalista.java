/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folha;

/**
 *
 * @author JULIA
 */
public class Mensalista extends Empregado{
    
    private String cargo;

    public Mensalista(String cargo, String nome, String endereco, Double salario) {
        super(nome, endereco, salario);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void cal_Salario() {
        if (cargo.equals("Junior")){
            salario = 2500.00; }
        else if (cargo.equals("Pleno")){
                salario = 3500.00;
        } else {
            salario = 5500.00;
        }
    }
}
