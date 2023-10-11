package aluno;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Teste {
    public static void main(String[] args) {
        Aluno aluno;
        Data data;

        data = new Data(10, 05, 2005);

        aluno = new Aluno (12345, "Maria", 'F', "987654321", "123456789", data);

        aluno.imprimir();
    }
}