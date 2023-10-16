package edu.ariadne.primeirasemana;


import java.util.Date;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        // final é uma constante ou seja o valor nao pode ser alterado
        final String BR = "Brasil";
        String nome = "Ariadne";
        String sobrenome = "Candido Liranço";
        int anoNascimento = 1996;
        boolean trabalha = true;
        double salario = 3.336;
        Date empregadaData  = new Date();
        char sexo = 'F';

        System.out.println("Hello, " + nomeCompleto(nome, sobrenome) + " nascida no ano de " + anoNascimento + " do sexo " + sexo +  " no "
                + BR + " se tornou" + capturaProfissao(trabalha) + "empregada no dia " + empregadaData + "ganhando apenas R$" + salario +  "!");
    }

    public static String capturaProfissao(boolean wasWork) {
        if (wasWork == true) {
            return " desenvolvedora ";
        }
        return " desempregada ";
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
