package by.belhard.j19.hw.hw9.task5;

import by.belhard.j19.hw.hw9.task5.entities.Account;
import by.belhard.j19.hw.hw9.task5.entities.Transaction;
import by.belhard.j19.hw.hw9.task5.io.AccountReader;
import by.belhard.j19.hw.hw9.task5.io.AccountsWriter;
import by.belhard.j19.hw.hw9.task5.io.TransactionsReader;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Account> accounts = AccountReader.readAccounts("src/by/belhard/j19/hw/hw9/task5/resources/input1.txt");

		List<Transaction> transactions = TransactionsReader.readTransactions("src/by/belhard/j19/hw/hw9/task5/resources/input2.txt");

		List<Account> newAccounts = TransactionsProcessing.doTransactions(accounts, transactions);

		AccountsWriter.writeAccounts(newAccounts, "src/by/belhard/j19/hw/hw9/task5/resources/output.dt");
	}
}
