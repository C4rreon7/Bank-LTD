package banking.domain;

public class Account {
    protected double balance;
    
    //Constructor.
    public Account (double varBalance){
        this.balance = varBalance;
    }
    
    //Metodos.
    public double getBalance(){
        return balance;
    }
    
    public boolean deposit(double money){
        balance += money;
        return true;
    }
    public void withdraw(double money)throws OverdraftException{
        if(money < balance){
            balance -= money; 
        }else{
            throw new OverdraftException("No tienes la cantidad suficiente de dinero.", (-balance-money));
        }
    }
}
