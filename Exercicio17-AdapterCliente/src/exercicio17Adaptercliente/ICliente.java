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
public interface ICliente {
    public String getNomeCompleto();
    public void setNomeCompleto(String nome);
    public String getEmail();
    public void setEmail(String email);
    public String getTelefone();
    public void setTelefone(String telefone);
    public String getCelular();
    public void setCelular(String celular);
}
