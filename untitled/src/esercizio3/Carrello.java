package esercizio3;

import java.util.Arrays;

public class Carrello {
    //Attributi
    private int clienteAssociato;
    private String[] articoli = new String[5];
    private int totCostoArt;

    //Costruttori
    public Carrello(int clienteAssociato) {
        this.clienteAssociato = clienteAssociato;

    }
    //Metodi

    //Altro


    @Override
    public String toString() {
        return "Carrello{" +
                "clienteAssociato=" + clienteAssociato +
                ", articoli=" + Arrays.toString(articoli) +
                ", totCostoArt=" + totCostoArt +
                '}';
    }

    public int getClienteAssociato() {
        return clienteAssociato;
    }

    public void setClienteAssociato(int clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public String[] getArticoli() {
        return articoli;
    }

    public void setArticoli(String[] articoli) {
        this.articoli = articoli;
    }

    public int getTotCostoArt() {
        return totCostoArt;
    }

    public void setTotCostoArt(int totCostoArt) {
        this.totCostoArt = totCostoArt;
    }
}
