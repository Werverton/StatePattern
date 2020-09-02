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
public class RedState extends State{

    
    public RedState(Conta conta) {
        super(conta);
    }

  
    
@Override
    public double Saldo() {
        if (conta.getSaldo()<1000){
            conta.setState(new RedState(conta));
            System.out.println("Conta eem redstate");
        } else if (conta.getSaldo()>2000){
            System.out.println("conta saiu de redstate para goldstate");
            conta.setState(new GoldState(conta));
        }
        return conta.getSaldo();
    }

    @Override
    public double Depositar(double deposito) {
        conta.setSaldo(conta.getSaldo()+deposito);
        Saldo();
        
        
        
        return conta.getSaldo();
    }

    @Override
    public String sacar(double valor) {
        if(conta.getSaldo()< valor){
            
            conta.setState(new RedState(conta));
            return " não há saldo suficiente! Conta está em RedState";
        } else {
            double saldo = conta.getSaldo();
            conta.setSaldo(saldo-valor);
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
