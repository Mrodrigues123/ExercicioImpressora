package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato("contrato casa", "Pdf");
        Foto foto = new Foto("Foto praia", "jpeg");
        Documento documento = new Documento("RG", "Word");


        Impressora impressora = new Impressora();
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(documento);
        impressora.adicionarImprimivel(foto);

        impressora.imprimirTudo();


    }





}
