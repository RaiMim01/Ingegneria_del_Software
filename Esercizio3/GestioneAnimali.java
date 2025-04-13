
import java.util.ArrayList;
import java.util.List;

// Definizione dell'interfaccia Animale
interface Animale {
    void emettiVerso();
    void muoviti();
}

// Classe astratta AnimaleBase che implementa Animale
abstract class AnimaleBase implements Animale {
    protected String nome;

    public AnimaleBase(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe concreta Cane che eredita da AnimaleBase
class Cane extends AnimaleBase {
    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println(nome + " dice: Bau!");
    }

    @Override
    public void muoviti() {
        System.out.println(nome + " corre.");
    }
}

// Classe concreta Gatto che eredita da AnimaleBase
class Gatto extends AnimaleBase {
    public Gatto(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println(nome + " dice: Miao!");
    }

    @Override
    public void muoviti() {
        System.out.println(nome + " cammina.");
    }
}

// Programma principale
public class GestioneAnimali {
    public static void main(String[] args) {
        List<Animale> animali = new ArrayList<>();

        // Aggiunta di animali
        animali.add(new Cane("Fido"));
        animali.add(new Gatto("Whiskers"));

        // Interazione con tutti gli animali
        for (Animale animale : animali) {
            animale.emettiVerso();
            animale.muoviti();
        }
    }
}

