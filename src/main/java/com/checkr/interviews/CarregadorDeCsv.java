package com.checkr.interviews;

import com.opencsv.CSVReader;
import java.util.List;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;

public class CarregadorDeCsv {
    private static final String CSV_FILE = "startup_funding.csv";

    public static List<String[]> loadCsvData() throws IOException {
        List<String[]> csvData = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            String[] row;
            while ((row = reader.readNext()) != null) {
                csvData.add(row);
            }
        }
        csvData.remove(0);
        return csvData;
    }
}
