package com.example.designpattern;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@BrokenPattern(patternName = "Single Responsiblity Pattern", description = """
          The Journal is having multiple responsibility:
           1. Manage the entry (main responsibility)
           2. Persist the Journal as well
         """)
public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text){
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    /** below methods tempated to save a load the journal, however 
     * we have broken the SRP here
     * 
     * These methods make a new concern for journal
     */
    public void save(String fileName) throws FileNotFoundException{
        try (PrintStream out = new PrintStream(fileName)) {
            out.println(this.toString());
        } 
    }

    public void load(String fileName){}
    public void load(URL url){}
}

