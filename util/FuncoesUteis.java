package util;

import model.Aluno; // Importar a classe Aluno do pacote model
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {

    // Verificar se o CPF é válido com o uso do true ou false
    public static boolean verificarCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    // Calcular a multiplicação do peso e altura da pessoa usando o double
    public static double calcularIMC(double peso, double altura) {
        if (altura > 0) {
            return peso / (altura * altura);
        }
        return 0;
    }

    // Avaliação do aluno se tem mais ou menos de 75% de presença
    public static String avaliarAluno(Aluno aluno) {
        if (aluno.getNota() >= 5 && aluno.getPercentualPresenca() >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // Método de soma
    public int soma(int a, int b) {
        return a + b;
    }

    // Método para mostrar o triangulo
    public void triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Método para ler um arquivo e exibir-lo
    public void printArquivo(String caminho) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
