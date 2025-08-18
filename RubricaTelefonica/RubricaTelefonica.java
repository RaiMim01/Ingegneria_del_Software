
import java.util.ArrayList;

public class RubricaTelefonica {

    public static void main(String[] args) {

        System.out.println("--- Creazione della Rubrica Telefonica ---");

        // Creazione di un ArrayList per contenere oggetti di tipo Contatto
        ArrayList<Contatto> rubrica = new ArrayList<>();

        // Aggiunta di nuovi contatti
        Contatto contatto1 = new Contatto("Mario Rossi", "3331234567");
        Contatto contatto2 = new Contatto("Luigi Verdi", "3457654321");
        Contatto contatto3 = new Contatto("Anna Bianchi", "3219876543");

        // Aggiungiamo gli oggetti creati all'ArrayList.
        rubrica.add(contatto1);
        rubrica.add(contatto2);
        rubrica.add(contatto3);

        System.out.println("\nContatti aggiunti con successo!");
        System.out.println("Numero totale di contatti: " + rubrica.size());

        // Stampa di tutti i contatti presenti nella rubrica.
        System.out.println("\n--- Lista dei Contatti ---");

        for (Contatto contatto : rubrica) {
            System.out.println("Nome: " + contatto.getNome() + ", Telefono: " + contatto.getNumeroTelefono());
            //In alternativa: System.out.println(contatto);
        }

        System.out.println("\n--- Fine Programma ---");
    }
}
