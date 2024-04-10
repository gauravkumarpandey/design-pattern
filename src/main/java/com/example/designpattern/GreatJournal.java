package com.example.designpattern;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Fix the broken SRP of Journal class by seperating the concern of:
 *  <br> 1. Managing Journal
 *  <br> 2. Persisting Journal
 * 
 * @see com.example.designpattern.Journal
 */
public class GreatJournal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

class JournalPersister {
   
    public void saveToFile(GreatJournal journal, String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)) {
            out.println(journal.toString());
        }
    }

    public Journal load(String fileName) {
        return null;
    }

    public Journal load(URL url) {
        return null;
    }
}
