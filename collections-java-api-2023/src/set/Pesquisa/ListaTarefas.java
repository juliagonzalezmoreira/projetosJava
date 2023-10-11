package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if(t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if(!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
            Tarefa tarefaParaMarcarComoPendente = null;
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaMarcarComoPendente = t;
                    break;
                }
            }
            // se a tarefa não for nula, verifica se conlcuida é true, caso true (tarefaConcluida), tarefaParaMarcarComoPendente torna false
            if (tarefaParaMarcarComoPendente != null) {
                if(tarefaParaMarcarComoPendente.isConcluida()) {
                    tarefaParaMarcarComoPendente.setConcluida(false);
                }
            } else {
                System.out.println("Tarefa não encontrada na lista.");
            }
        }

        public void limparListaTarefas(){
            tarefaSet.clear();
        }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Bootcamp");
        listaTarefas.adicionarTarefa("Fazer uma caminhada");
        listaTarefas.adicionarTarefa("Lavar louça");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Lavar louça");
        listaTarefas.marcarTarefaConcluida("Estudar Bootcamp");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Estudar Bootcamp");
        listaTarefas.removerTarefa("Fazer uma caminhada");

        listaTarefas.exibirTarefas();

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());

        listaTarefas.limparListaTarefas();
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());


    }
    }

