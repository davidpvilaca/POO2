import java.util.Date;

/**
 * Created by davidpvilaca on 22/02/17.
 */
public class ContaPoupanca extends ContaBancaria {

    private Date dataAniversario;
    private double rendimento;

    ContaPoupanca(Cliente proprietario) {
        super(proprietario);
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
