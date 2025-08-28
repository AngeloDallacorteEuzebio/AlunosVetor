public class Vetor {
    private Aluno[] alunos;
    private int tamanho;

    public Vetor() {
        alunos = new Aluno[10];
        tamanho = 0;
    }

    public void inserir(Aluno aluno) {
        if (tamanho == alunos.length) {
            aumentarCapacidade();
        }
        alunos[tamanho] = aluno;
        tamanho++;
    }

    public void listarTodos() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(alunos[i]);
        }
    }

    public Aluno maiorNota() {
        if (tamanho == 0) return null;
        Aluno maior = alunos[0];
        for (int i = 1; i < tamanho; i++) {
            if (alunos[i].getNota() > maior.getNota()) {
                maior = alunos[i];
            }
        }
        return maior;
    }

    public Aluno menorNota() {
        if (tamanho == 0) return null;
        Aluno menor = alunos[0];
        for (int i = 1; i < tamanho; i++) {
            if (alunos[i].getNota() < menor.getNota()) {
                menor = alunos[i];
            }
        }
        return menor;
    }

    public double mediaNotas() {
        if (tamanho == 0) return 0;
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += alunos[i].getNota();
        }
        return soma / tamanho;
    }

    public boolean pesquisarPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public boolean excluirPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nome)) {
                for (int j = i; j < tamanho - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }
                alunos[tamanho - 1] = null;
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public int quantidadeAlunos() {
        return tamanho;
    }

    private void aumentarCapacidade() {
        Aluno[] novoArray = new Aluno[alunos.length * 2];
        for (int i = 0; i < alunos.length; i++) {
            novoArray[i] = alunos[i];
        }
        alunos = novoArray;
    }
}