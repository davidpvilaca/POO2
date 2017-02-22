/**
 * Created by davidpvilaca on 22/02/17.
 */
public class ContaCorrente extends ContaBancaria {
    private double limiteSaque;

    ContaCorrente(Cliente proprietario) {
        super(proprietario);
    }
    ContaCorrente(Cliente proprietario, double limiteSaque) {
        super(proprietario);
        this.setLimiteSaque(limiteSaque);
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
}
