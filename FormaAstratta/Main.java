// File: Main.java

public class Main {

    public static void main(String[] args) {
        Forma[] leMieForme = new Forma[3];

        leMieForme[0] = new Cerchio(10.0);
        leMieForme[1] = new Rettangolo(5.0, 4.0);
        leMieForme[2] = new Cerchio(2.5);

        System.out.println("Calcolo l'area delle forme nell'array:");

        for (Forma f : leMieForme) {
            System.out.printf("L'area di un %s è: %.2f\n", f.getClass().getSimpleName(), f.area());
        }
    }
}
