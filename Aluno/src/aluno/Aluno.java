package aluno;

public class Aluno {
    private int ra;
    private String nome;
    private char sex;
    private String rg;
    private String cpf;
    private Data dataNasc;

    public Aluno(int ra, String nome, char sex, String rg, String cpf, Data dataNasc) {
        this.ra = ra;
        this.nome = nome;
        this.sex = sex;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void imprimir(){
        System.out.println("RA:" + ra + "\nNome:" + nome + "\nSexo:" + sex + "\nRG:" + rg + "\nCPF:" + cpf + "\nData de nascimento:" + dataNasc.formatarData());
    }
}
