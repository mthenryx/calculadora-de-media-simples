package br.senai.sp.jandira.ds1t.calculoDeAprovacaoOuNao.model;

import java.util.Scanner;

public class Aluno {

    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double resultadoDaMedia;
    String aprovadoOuNao;
    String nome;

    public void obterDados (){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = leitor.nextLine();

        System.out.print("Digite a nota da atividade  1:");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a nota da atividade 2:");
        nota2 = leitor.nextDouble();

        System.out.print("Digite a nota da ativiade 3:");
        nota3 = leitor.nextDouble();

        System.out.print("Digite a nota da ativiade 4:");
        nota4 = leitor.nextDouble();

        calcularMediaESituacao();
    }

    public void calcularMediaESituacao(){

        resultadoDaMedia = (nota1 + nota2 + nota3 + nota4) / (4);

        if(resultadoDaMedia >= 5){
            aprovadoOuNao = ("Aprovado") ;
        } else {
            aprovadoOuNao = ("Reprovado");
        }

        exibirResultado();
    }

    public void exibirResultado(){
        System.out.println("*********************************************");
        System.out.println("A média do estudante " + nome + " é : " + resultadoDaMedia);
        System.out.println("Resultado: O(a) aluno(a) " + nome + " está " + aprovadoOuNao + "!");
        System.out.println("*********************************************");
    }
}
