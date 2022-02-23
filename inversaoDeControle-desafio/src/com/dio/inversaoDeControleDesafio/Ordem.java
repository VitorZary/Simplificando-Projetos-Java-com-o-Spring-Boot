package com.dio.inversaoDeControleDesafio;

public class Ordem {

    public static void main(String[] args){
        Ordem ordem = new Ordem();
        ordem.ordenar();
    }

    private LimparCasa limpar = LimparCasa.obterDadosCasa();

    public void ordenar(){
        this.limpar.retornar("Ordem enviada com sucesso!");
    }

}
