package com.dio.inversaoDeControleDesafio;

public class LimparCasa {
    public LimparCasa(String endereco, String horario) {

    }

    public static LimparCasa obterDadosCasa(){
        return new LimparCasa("Rua floresta 1212","08:00");
    }

    public void retornar(String mensagem){
        System.out.println("Ordem enviada!");
    }

}
