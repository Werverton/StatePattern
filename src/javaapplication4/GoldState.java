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
public class GoldState extends State{

    public GoldState(Conta conta) {
        super(conta);
    }

    
@Override
    public double Saldo() {
        if ((conta.getSaldo()<2000) && (conta.getSaldo()>1000)){
            conta.setState(new SilverState(conta));
            System.out.println("conta para Silverstate");
        } else {
            conta.setState(this);
        }
        return conta.getSaldo();
    }

    @Override
    public double Depositar(double deposito) {
        conta.setSaldo(conta.getSaldo()+deposito);
        conta.setState(new GoldState(conta));
        System.out.println("conta para goldstate");
        Saldo();
        return conta.getSaldo();
    }

    @Override
    public String sacar(double valor) {
        if(conta.getSaldo()< valor){
            
            conta.setState(new RedState(conta));
            return " não há saldo suficiente! Conta foi para RedState";
        } else {
            double saldo = conta.getSaldo();
            conta.setSaldo(saldo-valor);
            Saldo();
            return "aguarde o dinheiro";
        }
        
    }

    @Override
    public String pagar(double valor) {
        if(conta.getSaldo()< valor){
            conta.setState(new RedState(conta));
            return "Conta foi para RedState";
        }
        return "pagamento efetuado com sucesso";
    }
    
    
}
