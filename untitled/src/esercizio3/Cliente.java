package esercizio3;

import java.util.Random;

public class Cliente {
    //Attributi
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private String iscrizione;

    //Costruttori
    public Cliente(String nome, String cognome, String email) {
        Random rndm = new Random();
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.codiceCliente = rndm.nextInt(1, 10000);
        this.iscrizione = "22/05/2024";
    }
    //Metodi

    //Altro

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente=" + codiceCliente +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", iscrizione='" + iscrizione + '\'' +
                '}';
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIscrizione() {
        return iscrizione;
    }

    public void setIscrizione(String iscrizione) {
        this.iscrizione = iscrizione;
    }
}
