package esercizio3;

import java.util.Random;

public class Articolo {
    //Attributi
    private int codiceArticolo;
    private String descrzioneArticolo;
    private int prezzo;
    private int disponibili;

    //Costruttori
    public Articolo(int prezzo, int disponibili) {
        Random rndm = new Random();
        this.codiceArticolo = rndm.nextInt(1, 10000);
        this.descrzioneArticolo = "niente";
        this.prezzo = prezzo;
        this.disponibili = disponibili;
    }
    //Metodi

    //Altro

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrzioneArticolo='" + descrzioneArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", disponibili=" + disponibili +
                '}';
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrzioneArticolo() {
        return descrzioneArticolo;
    }

    public void setDescrzioneArticolo(String descrzioneArticolo) {
        this.descrzioneArticolo = descrzioneArticolo;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getDisponibili() {
        return disponibili;
    }

    public void setDisponibili(int disponibili) {
        this.disponibili = disponibili;
    }
}
