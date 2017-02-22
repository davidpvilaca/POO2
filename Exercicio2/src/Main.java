import java.util.Date;

/**
 * Created by davidpvilaca on 22/02/17.
 */
public class Main {
    public static void main(String[] args) {
        Cliente david = new Cliente("David Vilaça", 14496088762L);
        ContaCorrente conta1 = new ContaCorrente(david, 800.00);
        ContaPoupanca conta2 = new ContaPoupanca(david);

        System.out.println("Conta1: " + conta1.getNumero() + " | Saldo: " + conta1.getSaldo());
        System.out.println("Conta2: " + conta2.getNumero() + " | Saldo: " + conta2.getSaldo());
    }
}
