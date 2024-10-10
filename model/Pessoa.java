package model;

public class Pessoa {
    public String nome;
    public String cpf;
    public double peso;
    public double altura;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    // Pegando o nome
    public String getNome() {
        return nome;
    }
    //Colocando o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Pegando o cpf da pessoa
    public String getCpf() {
        return cpf;
    }
    //Colocando o cpf da pessoa
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //Pegando o peso da pessoa
    public double getPeso() {
        return peso;
    }
    //Colocando o peso da pessoa
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Pegando a altura da pessoa
    public double getAltura() {
        return altura;
    }
    //Colocando a altura da pessoa
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
