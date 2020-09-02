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
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta("werverton", 500);
        State state =  conta.getState();
        
        System.out.println(conta.toString());
        System.out.println(conta.getSaldo());
        
        
        System.out.println(conta.depositar(2000));
        System.out.println(conta.sacar(2500));
        System.out.println(conta.toString());
        
        System.out.println(conta.getSaldo());
        
        System.out.println(conta.sacar(2000));
        
        System.out.println(conta.toString());
        
        
        System.out.println(conta.depositar(5000));
        System.out.println(conta.toString());
    }
    
}
