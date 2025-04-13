import java.util.ArrayList;
import java.util.List;

// Interfaccia Pagabile
interface Pagabile {
    void effettuaPagamento(double importo) throws SaldoInsufficienteException;
}

// Eccezione personalizzata per saldo insufficiente
class SaldoInsufficienteException extends Exception {
    public SaldoInsufficienteException(String message) {
        super(message);
    }
}

// Classe astratta MetodoPagamento
abstract class MetodoPagamento implements Pagabile {
    protected double saldoDisponibile;

    public MetodoPagamento(double saldoDisponibile) {
        this.saldoDisponibile = saldoDisponibile;
    }

    public double getSaldoDisponibile() {
        return saldoDisponibile;
    }

    public void setSaldoDisponibile(double saldoDisponibile) {
        this.saldoDisponibile = saldoDisponibile;
    }
}

// Classe CartaDiCredito che eredita da MetodoPagamento
class CartaDiCredito extends MetodoPagamento {
    private String numeroCarta;

    public CartaDiCredito(double saldoDisponibile, String numeroCarta) {
        super(saldoDisponibile);
        this.numeroCarta = numeroCarta;
    }

    @Override
    public void effettuaPagamento(double importo) throws SaldoInsufficienteException {
        if (saldoDisponibile < importo) {
            throw new SaldoInsufficienteException("Saldo insufficiente sulla carta di credito.");
        }
        saldoDisponibile -= importo;
        System.out.println("Pagamento di " + importo + " euro effettuato con Carta di Credito " + numeroCarta);
    }
}

// Classe PayPal che eredita da MetodoPagamento
class PayPal extends MetodoPagamento {
    private String email;

    public PayPal(double saldoDisponibile, String email) {
        super(saldoDisponibile);
        this.email = email;
    }

    @Override
    public void effettuaPagamento(double importo) throws SaldoInsufficienteException {
        if (saldoDisponibile < importo) {
            throw new SaldoInsufficienteException("Saldo insufficiente su PayPal.");
        }
        saldoDisponibile -= importo;
        System.out.println("Pagamento di " + importo + " euro effettuato con PayPal (" + email + ")");
    }
}

// Classe SistemaPagamenti
class SistemaPagamenti {
    private List<MetodoPagamento> metodiPagamento;

    public SistemaPagamenti() {
        metodiPagamento = new ArrayList<>();
    }

    public void aggiungiMetodoPagamento(MetodoPagamento metodo) {
        metodiPagamento.add(metodo);
    }

    public void effettuaPagamento(MetodoPagamento metodo, double importo) {
        try {
            metodo.effettuaPagamento(importo);
        } catch (SaldoInsufficienteException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public void visualizzaMetodiPagamento() {
        for (MetodoPagamento metodo : metodiPagamento) {
            System.out.println(metodo.getClass().getSimpleName() + " - Saldo disponibile: " + metodo.getSaldoDisponibile() + " euro");
        }
    }

    public static void main(String[] args) {
        SistemaPagamenti sistema = new SistemaPagamenti();

        MetodoPagamento carta = new CartaDiCredito(500.0, "1234-5678-9012-3456");
        MetodoPagamento paypal = new PayPal(300.0, "utente@example.com");

        sistema.aggiungiMetodoPagamento(carta);
        sistema.aggiungiMetodoPagamento(paypal);

        sistema.visualizzaMetodiPagamento();

        sistema.effettuaPagamento(carta, 200.0);
        sistema.effettuaPagamento(paypal, 350.0); // Tentativo di pagamento con saldo insufficiente

        sistema.visualizzaMetodiPagamento();
    }
}

