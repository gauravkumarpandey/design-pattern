package com.example.designpattern;

import java.io.IOException;

public class SingleResponsibilityPattern {
    public static void main(String[] args) throws IOException {
       GreatJournal j = new GreatJournal();
          j.addEntry("I cried today");
          j.addEntry("I ate bug");

        System.out.println(j);

        JournalPersister journalPersister = new JournalPersister();
        String fileName = "c:\\tmp\\journal.txt";
        
        journalPersister.saveToFile(j, fileName);

        Runtime.getRuntime().exec("notepad.exe " + fileName);
    }
}