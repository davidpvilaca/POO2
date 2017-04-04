/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio17Adaptercliente;

/**
 *
 * @author davidpvilaca
 */
public class AdapterClienteS2 implements ICliente {
    private ClienteS2 cliente;
    
    public AdapterClienteS2(ClienteS2 cliente) {
        this.cliente = cliente;
    }

    @Override
    public String getNomeCompleto() {
        return this.cliente.getNome() + ' ' + cliente.getSobreNome();
    }
    
    @Override
    public void setNomeCompleto(String nome) {
        String[] n = nome.split(" ");
        String primeiroNome = n[0];
        String sobreNome = "";
        for (int i = 1; i < n.length; i++) sobreNome+=n[i];
        this.cliente.setNome(primeiroNome);
        this.cliente.setSobreNome(sobreNome);
    }

    @Override
    public String getEmail() {
        return this.cliente.getEmail();
    }
    
    @Override
    public void setEmail(String email) {
        this.cliente.setEmail(email);
    }

    @Override
    public String getTelefone() {
        return this.cliente.getDddTelefone() + this.cliente.getTelefone();
    }
    
    @Override
    public void setTelefone(String telefone) {
        assert telefone.length() > 9;
        String ddd = telefone.substring(0, 1);
        String tel = telefone.substring(2);
        this.cliente.setDddTelefone(ddd);
        this.cliente.setTelefone(tel);
    }

    @Override
    public String getCelular() {
        return this.cliente.getDddCelular() + this.cliente.getCelular();
    }
    
    @Override
    public void setCelular(String celular) {
        assert celular.length() > 10;
        String ddd = celular.substring(0, 1);
        String cel = celular.substring(2);
        this.cliente.setDddCelular(ddd);
        this.cliente.setCelular(cel);
    }
}
