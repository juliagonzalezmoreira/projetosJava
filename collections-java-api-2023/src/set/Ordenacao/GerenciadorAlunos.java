package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemovido = null;
        for(Aluno a : alunoSet){
            if(a.getMatricula() == matricula){
                alunoRemovido = a;
                break;
            }
        }
        alunoSet.remove(alunoRemovido);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Julia", 1L, 9D);
        gerenciadorAlunos.adicionarAluno("Ana", 2L, 5D);
        gerenciadorAlunos.adicionarAluno("Ruan", 3L, 7D);

        gerenciadorAlunos.exibirAlunos();

        System.out.println("Alunos por nome: " + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Alunos por nota: " + gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(1L);

        gerenciadorAlunos.exibirAlunos();
    }
}
