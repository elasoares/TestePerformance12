public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setMatricula(1);
        aluno.setNome("Rodrigo Junior");
        aluno.setNota1(8);
        aluno.setNota2(10);
        System.out.println(aluno.getMatricula() + aluno.getNome() + aluno.getNota1() + aluno.getNota2());
        System.out.println(aluno.calcularMedia(8, 10));
    }
}
