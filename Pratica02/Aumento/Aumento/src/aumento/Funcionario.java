/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aumento;

/**
 *
 * @author JULIA
 */
public class Funcionario extends Pessoa {
    
    private double salario;
    private double percentual;

    public Funcionario(double salario, double percentual, String nome, String RG) {
        super(nome, RG);
        this.salario = salario;
        this.percentual = percentual;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
    public double aumentar_Salario(){
        double aumento = salario * percentual;
        double salarioComAumento = salario + aumento;
        return salarioComAumento;
    }
    
    public void imprimir(){
        System.out.println("Nome:" +nome);
        System.out.println("RG: " + RG);
        System.out.println("Salário com acréscimo: "+ aumentar_Salario());
        System.out.println("---------------------------------");
    }
}
