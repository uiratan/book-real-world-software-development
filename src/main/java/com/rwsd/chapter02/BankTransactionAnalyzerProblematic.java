package com.rwsd.chapter02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;
public class BankTransactionAnalyzerProblematic {

    // What is the total profit and loss from a list of bank statements? Is it positive or negative?
// How many bank transactions are there in a particular month?
// What are his top-10 expenses? 
// Which category does he spend most of his money on?


    private static final String RESOURCES = "src/main/resources/";
    private static final  DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String... args) throws IOException {
        final Path path = Paths.get(RESOURCES + "bank-statements.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0;

        for(final String line: lines) {
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        } 
        
        System.out.println("The total for all transactions is " + total);

        total = 0;
        
        for (final String line : lines) {
            final String[] columns = line.split(",");
            final LocalDate date = LocalDate.parse(columns[0], DATE_FORMATTER);
            if (date.getMonth() == Month.JANUARY) {
                final double amount = Double.parseDouble(columns[1]);
                total += amount;
            }
        }

        System.out.println("The total for all transactions in January is " + total);
    }
            
}
