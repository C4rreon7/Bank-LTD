package banking.domain;

import banking.domain.Account;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount (double balance, double interestRate){

        super(balance);

        this.interestRate = interestRate;
    }
}
