package by.belhard.j19.hw.hw9.task5.io;

import by.belhard.j19.hw.hw9.task5.entities.Account;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountReader {

    public static List<Account> readAccounts(String path) {

        List<Account> result = new ArrayList<>();

        try (BufferedReader rdr = new BufferedReader(new FileReader(path))) {

            String[] split;
            while (rdr.ready()) {
                split = rdr.readLine().split(" ");

                String name = split[0];
                int amount = Integer.parseInt(split[1]);

                result.add(new Account(name, amount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
