
public class Contatto {

    private String nome;
    private String numeroTelefono;

    // Costruttore della classe
    public Contatto(String nome, String numeroTelefono) {
        this.nome = nome;
        this.numeroTelefono = numeroTelefono;
    }

    // --- Metodi Getter ---
    public String getNome() {
        return this.nome;
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    // --- Metodi Setter ---
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    // Metodo toString che fornisce una rappresentazione testuale dell'oggetto
    @Override
    public String toString() {
        return "Contatto -> Nome: " + this.nome + ", Telefono: " + this.numeroTelefono;
    }

}
