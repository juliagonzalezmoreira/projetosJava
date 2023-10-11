/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folha;

/**
 *
 * @author JULIA
 */
public class Horista extends Empregado {
    
    private double horas;

    public Horista(double horas, String nome, String endereco, Double salario) {
        super(nome, endereco, salario);
        this.horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public void cal_Salario() {
    salario = horas*50;
    }
}
