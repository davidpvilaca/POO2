/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio24Observadorcaixaentrada.caixaDeEntrada;

import java.util.ArrayList;

/**
 *
 * @author davidpvilaca
 */
public class Observable {
    
    private final ArrayList<Observer> monitores;
    
    public Observable() {
        this.monitores = new ArrayList();
    }
    
    /**
     * Adicionar observador
     * @param obs 
     */
    public void addObserver(Observer obs) {
        this.monitores.add(obs);
    }
    
    /**
     * Remover observador
     * @param obs 
     */
    public void deleteObserver(Observer obs) {
        this.monitores.remove(obs);
    }
    
    /**
     * Notificar observadores
     */
    public void notifyObserver() {
        monitores.forEach((Observer obs) -> {
            obs.update(this);
        });
    }
    
}
