import java.util.Date;

/**
 * Created by davidpvilaca on 22/02/17.
 */
public abstract class ContaBancaria {

    /**
     * Privates vars
     */
    private int numero;
    private Date dataAbertura;
    private double saldo;
    private Cliente proprietario;

    ContaBancaria(Cliente proprietario) {
        this.numero = 1 + (int)(Math.random() * 999999999);
        this.dataAbertura = new Date();
        this.saldo = 0;
        this.proprietario = proprietario;
        this.proprietario.addConta(this);
    }

    /**
     * Getters and setters area
     */
    public int getNumero() {
        return numero;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getProprietario() {
        return this.proprietario;
    }
    // end getters and setters

    /**
     * Methods
     */

    /**
     * Debitar do saldo
     * @param debito
     */
    public void debitar(double debito) {
        this.saldo -= debito;
    }

    /**
     * Adicionar crédito ao saldo
     * @param credito
     */
    public void creditar(double credito) {
        this.saldo += credito;
    }

    //end methods
}
