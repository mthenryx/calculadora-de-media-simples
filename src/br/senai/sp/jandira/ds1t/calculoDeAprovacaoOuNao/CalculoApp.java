package br.senai.sp.jandira.ds1t.calculoDeAprovacaoOuNao;

import br.senai.sp.jandira.ds1t.calculoDeAprovacaoOuNao.model.CalculoDeMediaEscolarEAprovadoOuNao;

public class CalculoApp {

    public static void main(String[] args) {
        System.out.println("Executando o aplicativo...");

        CalculoDeMediaEscolarEAprovadoOuNao calculo = new CalculoDeMediaEscolarEAprovadoOuNao();
        calculo.obterDados();
    }
}
