package com.colucy;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Chase Bank");

        bank.addBranch("Clintonville");

        bank.addCustomer("Clintonville", "Bob", 50.00);
        bank.addCustomer("Clintonville", "Mike", 150.00);
        bank.addCustomer("Clintonville", "Mary", 75.00);

        bank.addBranch("Columbus");
        bank.addCustomer("Columbus", "Charlie", 220.67);

        bank.addCustomerTransaction("Columbus", "Charlie", 234.98);
        bank.addCustomerTransaction("Columbus", "Charlie", 10.15);
        bank.addCustomerTransaction("Clintonville", "Mike", 2.75);

        bank.listCustomers("Clintonville", true);
        bank.listCustomers("Columbus", true);

        bank.addBranch("Canton");

        if(!bank.addCustomer("Canton", "Brian", 23.45)){
            System.out.println("Error branch Canton does not exist.");
        }

        


    }
}
