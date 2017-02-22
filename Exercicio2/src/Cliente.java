import java.util.Map;
import java.util.TreeMap;

/**
 * Created by davidpvilaca on 22/02/17.
 */
public class Cliente {
    private String nome;
    private long cpf;
    private TreeMap<String, ContaBancaria> contas;

    Cliente() {}

    Cliente(String nome, long cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.contas = new TreeMap<String, ContaBancaria>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Map<String, ContaBancaria> getContasBancarias() {
        return this.contas;
    }

    public void addConta(ContaBancaria conta) {
        this.contas.put(Integer.toString(conta.getNumero()), conta);
    }

    public void removeConta(int numero) {
        this.contas.remove(numero);
    }
}
