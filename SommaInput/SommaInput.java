
public class SommaInput {

    public static void main(String[] args) {

        int somma = 0;

        // Controlli per vedere se sono stati forniti degli argomenti da linea di comando
        if (args.length == 0) {
            System.out.println("Errore: Non hai inserito nessun numero da sommare!");
            System.out.println("Usa: java SommaInput <numero1> <numero2> ...");
            return; // Termina il programma se non ci sono input.
        }

        System.out.print("Numeri ricevuti: ");

        for (String argomento : args) {
            System.out.print(argomento + " ");

            // Convertiamo la stringa in un numero intero
            int numero = Integer.parseInt(argomento);

            somma += numero;
        }

        // Stampa dei risultati
        System.out.println("\nLa somma totale è: " + somma);
    }
}
