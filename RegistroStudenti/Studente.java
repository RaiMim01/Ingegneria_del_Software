
import java.util.ArrayList;

public class Studente {

    private String nome;
    private String matricola;
    private ArrayList<Integer> voti;

    public Studente(String nome, String matricola) {
        this.nome = nome;
        this.matricola = matricola;
        this.voti = new ArrayList<>(); // Inizializzo la lista vuota
    }

    // --- Metodi Getter ---
    public String getNome() {
        return nome;
    }

    public String getMatricola() {
        return matricola;
    }

    // Metodi per gestire i voti
    public void aggiungiVoto(int voto) {
        this.voti.add(voto);
    }

    public double calcolaMedia() {
        if (voti.isEmpty()) {
            return 0.0;
        }

        int somma = 0;
        for (int voto : voti) {
            somma += voto;
        }

        return (double) somma / voti.size();
    }

    @Override
    public String toString() {
        return "Studente -> Nome: " + nome + ", Matricola: " + matricola;
    }
}
