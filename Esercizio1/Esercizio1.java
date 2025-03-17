import java.util.ArrayList;
import java.util.List;

// Definizione dell'interfaccia Veicolo
interface Veicolo {
    void avvia();
    void ferma();
    String getTipo();
}

// Classe astratta MezzoDiTrasporto che implementa Veicolo
abstract class MezzoDiTrasporto implements Veicolo {
    protected String targa;

    public MezzoDiTrasporto(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }
}
// Classe concreta Auto che eredita da MezzoDiTrasporto
class Auto extends MezzoDiTrasporto {
    public Auto(String targa) {
        super(targa);
    }

    @Override
    public void avvia() {
        System.out.println("Auto con targa " + targa + " avviata.");
    }

    @Override
    public void ferma() {
        System.out.println("Auto con targa " + targa + " fermata.");
    }

    @Override
    public String getTipo() {
        return "Auto";
    }
}
// Classe concreta Moto che eredita da MezzoDiTrasporto
class Moto extends MezzoDiTrasporto {
    public Moto(String targa) {
        super(targa);
    }

    @Override
    public void avvia() {
        System.out.println("Moto con targa " + targa + " avviata.");
    }

    @Override
    public void ferma() {
        System.out.println("Moto con targa " + targa + " fermata.");
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
// Programma principale
public class Esercizio1 {
    public static void main(String[] args) {
        List<Veicolo> flotta = new ArrayList<>();

        // Aggiunta di veicoli 
        flotta.add(new Auto("AB123CD"));
        flotta.add(new Moto("EF456GH"));

        // Avvio di tutti i veicoli 
        for (Veicolo veicolo : flotta) {
            veicolo.avvia();
        }

        // Fermata di tutti i veicoli 
        for (Veicolo veicolo : flotta) {
            veicolo.ferma();
        }
    }
}