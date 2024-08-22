import lombok.*;

@Getter@AllArgsConstructor@NoArgsConstructor
public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    public int setMatricula(int matricula) {
        if(matricula <= 0){
            throw new ArithmeticException("Erro: Matrícula deve ser maior que zero.");
        }
        this.matricula = matricula;
        return matricula;
    }
    public void setNome(String nome) {
        if(nome == null || nome.length() < 4){
            throw new RuntimeException("Erro: O campo nome deve " +
                    "ter pelo menos 4 caracteres.");
        }
        if(!nome.contains(" ") || nome.split(" ").length < 2) {
            throw new RuntimeException("Erro: O nome deve conter pelo " +
                    "menos um nome e um sobrenome.");
        }
        this.nome = nome;
    }
    public void setNota1(double nota1) {
        if(nota1 < 0 || nota1 > 10){
            throw new ArithmeticException("Notas devem ser entre 0 e 10.");
        }
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        if(nota2 < 0 || nota2 > 10){
            throw new RuntimeException("Notas devem ser entre 0 e 10.");
        }
        this.nota2 = nota2;
    }







    public double calcularMedia(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
        return (nota1 + nota2) / 2;
    }

}
