/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author werve
 */
public abstract class State {
    Conta conta;
    
    
    
    State(Conta conta){
        this.conta = conta;
    }
    
    public abstract double Saldo();
    public abstract double Depositar(double deposito);
    public abstract String sacar(double valor);
    public abstract String pagar(double valor);
    
    
}
