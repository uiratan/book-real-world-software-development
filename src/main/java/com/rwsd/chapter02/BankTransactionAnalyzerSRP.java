package com.rwsd.chapter02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionAnalyzerSRP {

    private static final String RESOURCES = "src/main/resources/";

    public static void main(String... args) throws IOException {
        final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
        
        final Path path = Paths.get(RESOURCES + "bank-statements.csv");
        final List<String> lines = Files.readAllLines(path);
        
        List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);

        System.out.println("The total for all transactions in January is " + calculateTotalAmount(bankTransactions));
        System.out.println("Transactions in January " + selectInMonth(bankTransactions, Month.JANUARY));

    }

    public static double calculateTotalAmount(List<BankTransaction> bankTransactions) {
        double total = 0d;

        for (final BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }
        return total;
    }
            
    public static List<BankTransaction> selectInMonth(List<BankTransaction> bankTransactions, final Month month) {
        List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();

        for (final BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDate().getMonth() == month) {
                bankTransactionsInMonth.add(bankTransaction);
            }
        }
        return bankTransactionsInMonth;
    }
}
