import java.util.ArrayList;
import java.util.List;

// Interfaccia Prenotabile
interface Prenotabile {
    void prenota() throws Exception;
}

// Classe astratta Viaggio
abstract class Viaggio implements Prenotabile {
    protected String destinazione;
    protected double prezzo;
    protected boolean prenotato;

    public Viaggio(String destinazione, double prezzo) {
        this.destinazione = destinazione;
        this.prezzo = prezzo;
        this.prenotato = false;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public boolean isPrenotato() {
        return prenotato;
    }

    public abstract String descrizione();

    @Override
    public void prenota() throws Exception {
        if (prenotato) {
            throw new Exception("Viaggio già prenotato!");
        }
        prenotato = true;
    }
}

// Classe ViaggioAereo che eredita da Viaggio
class ViaggioAereo extends Viaggio {
    private String compagniaAerea;

    public ViaggioAereo(String destinazione, double prezzo, String compagniaAerea) {
        super(destinazione, prezzo);
        this.compagniaAerea = compagniaAerea;
    }

    @Override
    public String descrizione() {
        return "Viaggio Aereo a " + destinazione + " con " + compagniaAerea + " al prezzo di " + prezzo + " euro.";
    }
}

// Classe ViaggioTreno che eredita da Viaggio
class ViaggioTreno extends Viaggio {
    private int numeroPosto;

    public ViaggioTreno(String destinazione, double prezzo, int numeroPosto) {
        super(destinazione, prezzo);
        this.numeroPosto = numeroPosto;
    }

    @Override
    public String descrizione() {
        return "Viaggio in Treno a " + destinazione + " con posto numero " + numeroPosto + " al prezzo di " + prezzo + " euro.";
    }
}

// Classe SistemaPrenotazioni
class SistemaPrenotazioni {
    private List<Viaggio> viaggi;

    public SistemaPrenotazioni() {
        viaggi = new ArrayList<>();
    }

    public void aggiungiViaggio(Viaggio viaggio) {
        viaggi.add(viaggio);
    }

    public void prenotaViaggio(Viaggio viaggio) {
        try {
            viaggio.prenota();
            System.out.println("Prenotazione effettuata per: " + viaggio.descrizione());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public void visualizzaViaggi() {
        for (Viaggio viaggio : viaggi) {
            System.out.println(viaggio.descrizione() + " - Prenotato: " + (viaggio.isPrenotato() ? "Sì" : "No"));
        }
    }

    public static void main(String[] args) {
        SistemaPrenotazioni sistema = new SistemaPrenotazioni();

        Viaggio viaggio1 = new ViaggioAereo("Parigi", 150.0, "Air France");
        Viaggio viaggio2 = new ViaggioTreno("Roma", 80.0, 12);

        sistema.aggiungiViaggio(viaggio1);
        sistema.aggiungiViaggio(viaggio2);

        sistema.visualizzaViaggi();

        sistema.prenotaViaggio(viaggio1);
        sistema.prenotaViaggio(viaggio1); // Tentativo di prenotare di nuovo lo stesso viaggio

        sistema.visualizzaViaggi();
    }
}