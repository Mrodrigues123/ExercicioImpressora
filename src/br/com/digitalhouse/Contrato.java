package br.com.digitalhouse;

public class Contrato implements Imprimivel {


    private String nome;
    private String tipo;

    public Contrato(String nome, String tipo){

    }




    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal" + nome + tipo);
    }
}