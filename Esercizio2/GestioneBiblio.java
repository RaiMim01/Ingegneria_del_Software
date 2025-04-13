
import java.util.ArrayList;
import java.util.List;

// Classe astratta MaterialeBibliotecario
abstract class MaterialeBibliotecario {

    protected String titolo;
    protected int annoPubblicazione;

    public MaterialeBibliotecario(String titolo, int annoPubblicazione) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo + ", Anno di Pubblicazione: " + annoPubblicazione;
    }
}

// Classe Libro che eredita da MaterialeBibliotecario
class Libro extends MaterialeBibliotecario {

    private String autore;

    public Libro(String titolo, int annoPubblicazione, String autore) {
        super(titolo, annoPubblicazione);
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autore: " + autore;
    }
}

// Classe Rivista che eredita da MaterialeBibliotecario
class Rivista extends MaterialeBibliotecario {

    private int numeroEdizione;

    public Rivista(String titolo, int annoPubblicazione, int numeroEdizione) {
        super(titolo, annoPubblicazione);
        this.numeroEdizione = numeroEdizione;
    }

    public int getNumeroEdizione() {
        return numeroEdizione;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero Edizione: " + numeroEdizione;
    }
}

// Classe Biblioteca
class Biblioteca {

    private List<MaterialeBibliotecario> materiali;

    public Biblioteca() {
        materiali = new ArrayList<>();
    }

    public void aggiungiMateriale(MaterialeBibliotecario materiale) {
        materiali.add(materiale);
    }

    public void rimuoviMateriale(MaterialeBibliotecario materiale) {
        materiali.remove(materiale);
    }

    public void visualizzaMateriali() {
        for (MaterialeBibliotecario materiale : materiali) {
            System.out.println(materiale);
        }
    }
}

public class GestioneBiblio {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Il Signore degli Anelli", 1954, "J.R.R. Tolkien");
        Rivista rivista1 = new Rivista("National Geographic", 2021, 5);

        biblioteca.aggiungiMateriale(libro1);
        biblioteca.aggiungiMateriale(rivista1);

        biblioteca.visualizzaMateriali();
    }
}
