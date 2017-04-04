/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19Facadetelevisao;

/**
 *
 * @author davidpvilaca
 */
public class FacadeTelevisao {
    private Video video;
    private Sintonizador sintonizador;
    private Som som;
    
    public FacadeTelevisao() {
        video = new Video();
        sintonizador = new Sintonizador();
        som = new Som();
    }
    
    public void ligar() {
        this.video.ligar();
        this.som.ligar();
        this.sintonizador.sintonizarCanal();
        this.video.exibirImagem();
        this.som.emitirSom();
    }
    
    public void desligar() {
        this.som.desligar();
        this.video.desligar();
    }
    
    public void aumentarVolume() {
        this.som.aumentar();
    }
    
    public void diminuirVilume() {
        this.som.diminuir();
    }
    
}
