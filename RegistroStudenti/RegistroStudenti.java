
import java.util.ArrayList;

public class RegistroStudenti {

    public static void main(String[] args) {

        ArrayList<Studente> registro = new ArrayList<>();

        // Primo studente
        Studente studente1 = new Studente("Mario Rossi", "S123");
        studente1.aggiungiVoto(28);
        studente1.aggiungiVoto(25);
        studente1.aggiungiVoto(30);

        // Secondo studente
        Studente studente2 = new Studente("Giulia Verdi", "S456");
        studente2.aggiungiVoto(22);
        studente2.aggiungiVoto(24);

        // Terzo studente
        Studente studente3 = new Studente("Luca Bianchi", "S789");

        // 3. Aggiungiamo gli studenti al registro.
        registro.add(studente1);
        registro.add(studente2);
        registro.add(studente3);

        for (Studente s : registro) {
            // Stampa nome e matricola 
            System.out.println(s);

            double media = s.calcolaMedia();

            System.out.printf(" -> Media voti: %.2f\n\n", media);
        }
    }
}
