
public class Main {

    public static void main(String[] args) {

        Contatore<Integer> contatoreDiNumeri = new Contatore<>();

        Integer[] arrayDiNumeri = {10, 5, -3, 100, 42, 4, 66, 21};

        for (Integer numero : arrayDiNumeri) {
            contatoreDiNumeri.aggiungi(numero);
        }

        System.out.println("Conteggio Numeri:");
        System.out.println("Numero totale di interi contati: " + contatoreDiNumeri.conteggio());
        contatoreDiNumeri.stampaElementi(); // Si può decommentare per vedere gli elementi

        System.out.println("\n");

        Contatore<String> contatoreDiStringhe = new Contatore<>();

        String[] arrayDiStringhe = {"Ciao", "Mondo", "Hola", "Bonjour", "Yo"};

        for (String testo : arrayDiStringhe) {
            contatoreDiStringhe.aggiungi(testo);
        }

        System.out.println("Conteggio Stringhe:");
        System.out.println("Numero totale di stringhe contate: " + contatoreDiStringhe.conteggio());
        contatoreDiStringhe.stampaElementi(); // Si può decommentare per vedere gli elementi
    }
}
