
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Squadra> classifica = new ArrayList<>();

        classifica.add(new Squadra("Juventus", 70));
        classifica.add(new Squadra("Milan", 79));
        classifica.add(new Squadra("Inter", 84));
        classifica.add(new Squadra("Napoli", 79));
        classifica.add(new Squadra("Roma", 63));

        System.out.println("Classifica Iniziale");
        for (Squadra s : classifica) {
            System.out.println(s);
        }

        Collections.sort(classifica);

        System.out.println("\nClassifica Finale Ordinata");
        for (Squadra s : classifica) {
            System.out.println(s);
        }
    }
}
