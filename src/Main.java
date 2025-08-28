public class Main {
    public static void main(String[] args) {
        Vetor turma = new Vetor();

        turma.inserir(new Aluno("Angelo", 9.5));
        turma.inserir(new Aluno("Roberto", 6.9));
        turma.inserir(new Aluno("Fernando", 7.2));
        turma.inserir(new Aluno("Dione", 7.8));
        turma.inserir(new Aluno("Eduardo", 7.9));

        System.out.println(" --- Lista dos alunos:");
        turma.listarTodos();

        System.out.println("\n Maior nota: " + turma.maiorNota());
        System.out.println("Menor nota: " + turma.menorNota());
        System.out.println("Média da turma: " + String.format("%.2f", turma.mediaNotas()));

        System.out.println("\nPesquisa por nome 'Angelo': " + turma.pesquisarPorNome("Angelo"));
        System.out.println("Exclusão de 'Eduardo': " + turma.excluirPorNome("Eduardo"));

        System.out.println("\n Lista atualizada:");
        turma.listarTodos();

        System.out.println("\n👥 Quantidade de alunos: " + turma.quantidadeAlunos());
    }
}