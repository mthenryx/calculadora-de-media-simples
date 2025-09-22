package br.senai.sp.jandira.ds1t.calculoDeAprovacaoOuNao;

import br.senai.sp.jandira.ds1t.calculoDeAprovacaoOuNao.model.Aluno;

public class MediaFinalApp {

    public static void main(String[] args) {
        System.out.println("Executando o aplicativo...");

        Aluno calculo = new Aluno();
        calculo.obterDados();
    }
}
