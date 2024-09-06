package com.checkr.interviews;

import java.util.List;
import java.util.*;


public class FiltroDeDados {
    private static final String[] HEADERS = {"permalink", "company_name", "number_employees", "category", "city", "state", "funded_date", "raised_amount", "raised_currency", "round"};

    public static List<String[]> filterData(List<String[]> csvData, Map<String, String> options) {
        if (options.isEmpty()) {
            return csvData;
        }

        List<String[]> filteredData = new ArrayList<>();
        for (String[] row : csvData) {
            boolean matches = options.entrySet().stream()
                .allMatch(option -> {
                    int columnIndex = Arrays.asList(HEADERS).indexOf(option.getKey());
                    return columnIndex >= 0 && row[columnIndex].equals(option.getValue());
                });
            if (matches) {
                filteredData.add(row);
            }
        }
        return filteredData;
    }
}
