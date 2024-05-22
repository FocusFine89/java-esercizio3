package esercizio2;

import java.util.Arrays;

public class Sim {
    //Attributi
    private long numero;
    private int credito;
    private String[] ultimeChiamate = new String[5];

    //costruttori
    public Sim(long numero) {
        this.numero = numero;
    }

    //Metodi
    public void stampaDati() {
        System.out.println("numero:" + this.numero);
        System.out.println("credito:" + this.credito);
        System.out.println("Ultime Chiamate:" + Arrays.toString(this.ultimeChiamate));
    }


    //Altro

    @Override
    public String toString() {
        return "{" +
                "numero=" + numero +
                ", credito=" + credito +
                ", ultimeChiamate=" + Arrays.toString(ultimeChiamate) +
                '}';
    }
}

