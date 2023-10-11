/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author JULIA
 */
public class Gerente extends Funcionario {
    private int senha;

    public Gerente(int senha, String nome, int cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public void autentica(){
        if (senha == 1234){
            System.out.println("A senha está correta!");
        } else {
            System.out.println("A senha está incorreta!");
        }
    }
    
    public void imprimir(){
        System.out.println("Nome:" + nome);
        System.out.println("CPF:" + cpf);
        System.out.println("Salário:" + salario);
        System.out.println("---------------------------------");
    }
}
