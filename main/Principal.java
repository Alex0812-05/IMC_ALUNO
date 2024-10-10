package main;

import util.FuncoesUteis;
import model.Aluno; // Importar a classe Aluno do pacote model
import model.Pessoa; // Importar a classe Pessoa do pacote model

public class Principal {
    public static void main(String[] args) {
        //Instância da classe FuncoesUteis
        FuncoesUteis funcoes = new FuncoesUteis();

        //Instância da classe Pessoa com nome, cpf, peso e altura
        Pessoa pessoa = new Pessoa("Alexandre Campos", "12345678901", 70.5, 1.75);
        System.out.println("Dados da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());

        //Instância da classe Aluno
        Aluno aluno = new Aluno("Maria Silva", "98765432100", 65.0, 1.60, 8.5, 80);
        System.out.println("\nDados do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Peso: " + aluno.getPeso());
        System.out.println("Altura: " + aluno.getAltura());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Percentual de Presença: " + aluno.getPercentualPresenca() + "%");

        //CPF da pessoa
        System.out.println("\nCPF válido? " + FuncoesUteis.verificarCpf(pessoa.getCpf()));

        // Calculo do IMC da pessoa
        double imcPessoa = FuncoesUteis.calcularIMC(pessoa.getPeso(), pessoa.getAltura());
        System.out.printf("O IMC de %s é: %.2f%n", pessoa.getNome(), imcPessoa);

        // Avaliação do aluno
        String resultadoAluno = FuncoesUteis.avaliarAluno(aluno);
        System.out.println("Resultado do aluno: " + resultadoAluno);

        //Método soma
        int resultadoSoma = funcoes.soma(5, 7);
        System.out.println("Resultado da soma: " + resultadoSoma);

        //Método triangulo
        System.out.println("Triângulo de altura 5:");
        funcoes.triangulo(5);
                                
       
    }
}
