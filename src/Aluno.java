public class Aluno {

    private static int totalAlunos = 0;

    public Aluno() {
        totalAlunos++;
    }

    public static int getTotalAlunos() {
        return totalAlunos;
    }
}
