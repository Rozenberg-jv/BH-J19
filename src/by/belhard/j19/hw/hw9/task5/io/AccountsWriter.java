package by.belhard.j19.hw.hw9.task5.io;

import by.belhard.j19.hw.hw9.task5.entities.Account;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class AccountsWriter {

	public static void writeAccounts(List<Account> newAccounts, String path) {

		newAccounts.sort(Comparator.comparing(Account::getName));

		try (BufferedWriter wrt = new BufferedWriter(new FileWriter(path))) {

			for (Account account : newAccounts) {
				wrt.write(account.toString());
				wrt.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
