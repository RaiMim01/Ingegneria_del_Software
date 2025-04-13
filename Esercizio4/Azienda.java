import java.util.ArrayList;
import java.util.List;

// Classe astratta Dipendente
abstract class Dipendente {
    protected String nome;
    protected double stipendio;

    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public abstract double calcolaStipendio();
}

// Classe Impiegato che eredita da Dipendente
class Impiegato extends Dipendente {
    public Impiegato(String nome, double stipendio) {
        super(nome, stipendio);
    }

    @Override
    public double calcolaStipendio() {
        return stipendio;
    }
}

// Classe Manager che eredita da Dipendente
class Manager extends Dipendente {
    private double bonus;

    public Manager(String nome, double stipendio, double bonus) {
        super(nome, stipendio);
        this.bonus = bonus;
    }

    @Override
    public double calcolaStipendio() {
        return stipendio + bonus;
    }
}

// Classe Azienda
class Azienda {
    private List<Dipendente> dipendenti;

    public Azienda() {
        dipendenti = new ArrayList<>();
    }

    public void aggiungiDipendente(Dipendente dipendente) {
        dipendenti.add(dipendente);
    }

    public void stampaStipendiTotali() {
        double totale = 0;
        for (Dipendente dipendente : dipendenti) {
            totale += dipendente.calcolaStipendio();
        }
        System.out.println("Stipendi totali: " + totale);
    }

    public static void main(String[] args) {
        Azienda azienda = new Azienda();

        Dipendente impiegato1 = new Impiegato("Mario Rossi", 2000);
        Dipendente manager1 = new Manager("Luigi Bianchi", 3000, 1000);

        azienda.aggiungiDipendente(impiegato1);
        azienda.aggiungiDipendente(manager1);

        azienda.stampaStipendiTotali();
    }
}

