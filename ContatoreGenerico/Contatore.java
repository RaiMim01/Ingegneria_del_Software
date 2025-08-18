
import java.util.ArrayList;
import java.util.List;

public class Contatore<T> {

    private List<T> elementi = new ArrayList<>();

    public void aggiungi(T elemento) {
        this.elementi.add(elemento);
    }

    public int conteggio() {
        return this.elementi.size();
    }

    public void stampaElementi() {
        System.out.println("Elementi contati: " + elementi);
    }
}
