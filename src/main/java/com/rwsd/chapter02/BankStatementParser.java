package com.rwsd.chapter02;

import java.util.List;

public interface BankStatementParser {

    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
    
}
