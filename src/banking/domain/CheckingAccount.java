package banking.domain;

import banking.domain.Account;

public class CheckingAccount extends Account{
    
    private double overdraftProtection;

    public CheckingAccount(double balance){
        super(balance);
    }

    public CheckingAccount(double balance, double protect){
        super(balance);
        overdraftProtection = protect;
    }

    public void withdraw(double money)throws OverdraftException{
        if(money < balance+overdraftProtection){
            balance -= money;
        }else{
            throw new OverdraftException("No tienes la cantidad suficiente de dinero.", (-balance-money));
        }
    }
}
