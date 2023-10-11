/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folha;

/**
 *
 * @author JULIA
 */
public class Empregado {

    protected String nome;
    protected String endereco;
    protected Double salario;
    
    public Empregado(String nome, String endereco, Double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public double imp_Renda() {
        double aux;
        if (salario < 1800)
            aux=0.1*salario;
        else aux=0.27*salario;
        return aux;              
    }
    
    public double cal_Inss() {
        return 0.11*salario;
    }
    
    public void imprimir(){
        System.out.println("Nome:" +nome);
        System.out.println("Endereco:" +endereco);
        System.out.println("Salário:" +salario);
        System.out.println("Imposto de renda:" +imp_Renda());
        System.out.println("INSS:" +cal_Inss());
        System.out.println("---------------------------------");
    }
}
