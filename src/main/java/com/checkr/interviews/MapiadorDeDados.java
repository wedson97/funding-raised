package com.checkr.interviews;

import java.util.*;


public class MapiadorDeDados {
    private static final String[] HEADERS = {"permalink", "company_name", "number_employees", "category", "city", "state", "funded_date", "raised_amount", "raised_currency", "round"};

    public static List<Map<String, String>> mapData(List<String[]> csvData) {
        List<Map<String, String>> output = new ArrayList<>();
        for (String[] row : csvData) {
            output.add(mapSingleEntry(row));
        }
        return output;
    }

    public static Map<String, String> mapSingleEntry(String[] row) {
        Map<String, String> mapped = new HashMap<>();
        for (int i = 0; i < HEADERS.length; i++) {
            mapped.put(HEADERS[i], row[i]);
        }
        return mapped;
    }
}
