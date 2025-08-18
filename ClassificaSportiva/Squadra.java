
public class Squadra implements Comparable<Squadra> {

    private String nome;
    private int punti;

    public Squadra(String nome, int punti) {
        this.nome = nome;
        this.punti = punti;
    }

    public String getNome() {
        return nome;
    }

    public int getPunti() {
        return punti;
    }

    @Override
    public String toString() {
        return this.nome + " (" + this.punti + " punti)";
    }

    @Override
    public int compareTo(Squadra altraSquadra) {
        // Vogliamo un ordinamento DECRESCENTE 
        // Quindi sottraiamo i punti di 'this' da quelli dell'altra squadra
        // Esempio:
        // - Se altraSquadra ha 80 punti e this ha 75, il risultato è 5 (positivo) -> 'this' va dopo
        // - Se altraSquadra ha 70 punti e this ha 75, il risultato è -5 (negativo) -> 'this' va prima
        return altraSquadra.getPunti() - this.getPunti();
    }
}
