package banking.reports;
import banking.domain.*;
import java.text.NumberFormat;
import java.util.ListIterator;
public class CustomerReport {
   public void generateReport() {
      NumberFormat currency_format = NumberFormat.getCurrencyInstance();
      /**
       * * Paso1: obtenga el objeto bank **
       */
      Bank bank = Bank.getBank();
      Customer customer;
      ListIterator bankIterator = bank.getCustomers();
      System.out.println("\t\t\tREPORTE DE CLIENTES");
      System.out.println("\t\t\t===================");
      while (bankIterator.hasNext()){
         customer = (Customer) bankIterator.next();
         System.out.println();
         System.out.println("Customer: " + customer.getLastName() + ", "  + customer.getFirstName());
         ListIterator customerIterator = customer.getAccounts();
         while(customerIterator.hasNext()){
            Account account = (Account)customerIterator.next();
            String account_type = "Desconocida";
            if(account instanceof SavingsAccount) {
               account_type = "Savings Account";
            } else if ( account instanceof CheckingAccount ) {
               account_type = "Checking Account";
            } else {
               account_type = "Unknown Account Type";
            }
            // Print the current balance of the account
            System.out.println("    " + account_type + ": su saldo es de "
                  + currency_format.format(account.getBalance()));
         }
      }
   }
}
