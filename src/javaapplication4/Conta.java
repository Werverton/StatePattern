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
public class Conta {
    private State state;
    public String proprietario;
    private double saldo;
    

    public Conta(String proprietario, double valor) {
        this.proprietario = proprietario;
        this.saldo = valor;
        this.state = new SilverState(this);
    }
    
    
   
    public double sacar(double valor){
        this.state.sacar(valor);
        return state.Saldo();
    }
    
    public double depositar(double valor){
        this.state.Depositar(valor);
        return state.Saldo();
    }
    
    public void pagar(double valor){
        this.state.pagar(valor);
    }
    

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "state=" + state + '}';
    }
    
    
    
}
