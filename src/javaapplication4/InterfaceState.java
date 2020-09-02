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
public interface InterfaceState {
    double verificasaldo(Conta conta);
    void deposit(double valor, Conta conta);
    void saque(double valor, Conta conta);
    void mudaState();
}
