package banking.data;

import banking.domain.*;

import java.io.*;
import java.util.Scanner;

public class DataSource {
    private File dataFile;

    public DataSource(String dataFilePath) {
        this.dataFile = new File(dataFilePath);
    }

    public void loadData() throws FileNotFoundException {
        Customer customer;
        Scanner scanf = new Scanner(dataFile);
        Bank bank = Bank.getBank();

        int numCustomers = scanf.nextInt();
        for (int i = 0; i < numCustomers; i++) {
            String name = scanf.next();
            String lastName = scanf.next();
            bank.addCustomer(name, lastName);
            customer = bank.getCustomer(i);
            int numAccounts = scanf.nextInt();
            for (int j = 0; j < numAccounts; j++) {
                String accountType = scanf.next();
                if(accountType.equals("S")){
                    float balance = scanf.nextFloat();
                    float interestRate = scanf.nextFloat();
                    customer.addAccount(new SavingsAccount(balance, interestRate));
                }
                if(accountType.equals("C")){
                    float balance = scanf.nextFloat();
                    float overdraftProtection = scanf.nextFloat();
                    customer.addAccount(new CheckingAccount(balance, overdraftProtection));
                }
            }
        }
        scanf.close();
    }
}
