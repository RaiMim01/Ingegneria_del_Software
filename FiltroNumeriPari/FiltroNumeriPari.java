
public class FiltroNumeriPari {

    public static void main(String[] args) {

        int[] numeri = {3, 8, 10, 21, 44, 57, 60, 7};

        // Stampo un messaggio per far capire cosa farà il programma.
        System.out.println("Array originale: [3, 8, 10, 21, 44, 57, 60, 7]");
        System.out.println("Filtro e stampo solo i numeri pari:");

        for (int numero : numeri) {

            if (numero % 2 == 0) {

                System.out.println(numero);
            }
        }
    }
}
