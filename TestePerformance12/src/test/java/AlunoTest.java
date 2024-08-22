import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    @Test
    public void testarMatricula() {
        int numero = 5;
        int esperado = 5;
        Aluno matricula = new Aluno();
       int resultado =  matricula.setMatricula(numero);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testarNome() {
        String nome = "Elaine Soares";

        Aluno matricula = new Aluno();
        matricula.setNome(nome);
       Assertions.assertEquals(nome, matricula.getNome());
    }

    @Test
    public void testarNota1() {
        double nota = 1;
        Aluno nota1 = new Aluno();
        nota1.setNota1(nota);
        Assertions.assertEquals(nota, nota1.getNota1());
    }

    @Test
    public void testarNota2() {
        double nota = 5;
        Aluno nota2 = new Aluno();
        nota2.setNota2(nota);
        Assertions.assertEquals(nota, nota2.getNota2());
    }

    @Test
    public void calcularMediaTest(){
        Aluno aluno = new Aluno();
        aluno.setNota1(8.0);
        aluno.setNota2(6.0);

        double nota1 = aluno.getNota1();
        double nota2 = aluno.getNota2();

        double media = aluno.calcularMedia(nota1, nota2);

        Assertions.assertEquals(7.0, media, 0.001);

    }
}
