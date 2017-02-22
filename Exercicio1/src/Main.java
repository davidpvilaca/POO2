/**
 * Created by davidpvilaca on 22/02/17.
 */
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaPoupanca conta2 = new ContaPoupanca();
        conta1.setSaldo(100);
        conta2.setSaldo(200);
        conta2.setJuros(1.2);
        System.out.println("Conta 1 saldo: " + conta1.getSaldo());
        System.out.println("Conta 1 tributos: " + conta1.calculaTributos());
        System.out.println("Conta 2 saldo: " + conta2.getSaldo());
        System.out.println("Conta 2 juros: " + conta2.getJuros());
    }
}
