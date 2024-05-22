import esercizio1.Rettangolo;
import esercizio2.Sim;
import esercizio3.Articolo;
import esercizio3.Carrello;
import esercizio3.Cliente;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(20, 45);
        rettangolo1.stampaRettangolo();

        Rettangolo sommaRettangoli = new Rettangolo(20, 45, 33, 49);
        sommaRettangoli.stampa2Rettangoli();
        Sim sim1 = new Sim(333142118);

        sim1.stampaDati();
        System.out.println(sim1);

        Articolo articolo1 = new Articolo(10, 3);
        Articolo articolo2 = new Articolo(22, 10);
        Articolo articolo3 = new Articolo(15, 8);


        Cliente cliente1 = new Cliente("Giacomo", "Qwerty", "giacomo@giacomo.com");
        Carrello carrelloGiacomo = new Carrello(cliente1.getCodiceCliente());
        System.out.println(carrelloGiacomo);
        System.out.println(cliente1);
    }


}