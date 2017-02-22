/**
 * Created by davidpvilaca on 22/02/17.
 */
public class ContaCorrente extends Conta implements ITributavel {
    @Override
    public double calculaTributos() {
        return (this.getSaldo() * 10)/100;
    }
}
