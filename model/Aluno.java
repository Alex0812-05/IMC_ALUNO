 package model;

public class Aluno extends Pessoa {
    private double nota;
    private double percentualPresenca;

    // Construtor da classe Aluno
    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
        super(nome, cpf, peso, altura);
        this.nota = nota;
        this.percentualPresenca = percentualPresenca;
    }

    //Pegando a nota
    public double getNota() {
        return nota;
    }
    //Colocando a nota
    public void setNota(double nota) {
        this.nota = nota;
    }
    //pegando o Percentual de Presenças
    public double getPercentualPresenca() {
        return percentualPresenca;
    }
    //Colocando o percentual de presenças
    public void setPercentualPresenca(double percentualPresenca) {
        this.percentualPresenca = percentualPresenca;
    }
}

