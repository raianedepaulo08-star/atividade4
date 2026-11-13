public class Main {
    public static void main(String[] args) {
        System.out.println(Aluno.getTotalAlunos());
        new Aluno();
        new Aluno();
        new Aluno();
        System.out.println(Aluno.getTotalAlunos());
        System.out.println(Conversor.celsiusParaFahrenheit(30));
        System.out.println(Conversor.kmParaMilhas(10));
        System.out.println(Conversor.realParaDolar(100));
    }
}
