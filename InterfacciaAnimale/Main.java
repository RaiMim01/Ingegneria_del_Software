
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animale> animali = new ArrayList<>();

        animali.add(new Cane());
        animali.add(new Gatto());
        animali.add(new Gatto());
        animali.add(new Cane());

        System.out.println("Sentiamo i versi degli animali:");

        for (Animale a : animali) {

            System.out.println("L'animale fa: " + a.verso());
        }
    }
}
