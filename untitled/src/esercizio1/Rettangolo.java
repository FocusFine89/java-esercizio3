package esercizio1;

public class Rettangolo {
    //Attributi
    private int altezza;
    private int larghezza;
    private int altezza2;
    private int larghezza2;
    //Area e perimentro saranno da calcolare


    //Costruttori
    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public Rettangolo(int altezza, int larghezza, int altezza2, int larghezza2) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.altezza2 = altezza2;
        this.larghezza2 = larghezza2;
    }
    //Meotodi

    public void stampaRettangolo() {
        int perimetro = (this.altezza + this.larghezza) * 2;
        int area = this.altezza * this.larghezza;
        System.out.println("il perimetro del rettangolo è: " + perimetro);
        System.out.println("l'area del rettangolo è: " + area);
    }

    public void stampa2Rettangoli() {
        int perimetro = (this.altezza + this.larghezza) * 2;
        int perimetro2 = (this.altezza2 + this.larghezza2) * 2;
        int area = this.altezza * this.larghezza;
        int area2 = this.altezza2 * this.larghezza2;
        System.out.println("Perimetro Rettangolo 1:" + perimetro);
        System.out.println("Area Rettangolo 1:" + area);
        System.out.println("Perimetro Rettangolo 2:" + perimetro2);
        System.out.println("Area Rettangolo 2:" + area2);
        System.out.println("Somma dei due perimetri: " + perimetro + perimetro2);
        System.out.println("Somma delle due aree: " + area + area2);
    }

    //Setter e getter

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza2() {
        return altezza2;
    }

    public void setAltezza2(int altezza2) {
        this.altezza2 = altezza2;
    }

    public int getLarghezza2() {
        return larghezza2;
    }

    public void setLarghezza2(int larghezza2) {
        this.larghezza2 = larghezza2;
    }
}
