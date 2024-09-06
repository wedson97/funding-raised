// package com.checkr.interviews;

// import java.util.*;
// import com.opencsv.CSVReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class FundingRaised {
//     public static List<Map<String, String>> where(Map<String, String> options) throws IOException {
//         List<String[]> csvData = new ArrayList<String[]>();
//         CSVReader reader = new CSVReader(new FileReader("startup_funding.csv"));
//         String[] row = null;

//         while((row = reader.readNext()) != null) {
//             csvData.add(row);
//         }
        

//         reader.close();
//         csvData.remove(0);

//         if(options.size() > 0) {
//             List<String[]> results = new ArrayList<>();
//             List<String[]> results_mult = new ArrayList<>();
//             Set<String> keys = options.keySet();

//             for(int i = 0; i < csvData.size(); i++) {
//                 int cont = 0;
//                 for (int j = 0; j < csvData.get(i).length; j++) {
//                     for (String key : keys) {
//                         if(csvData.get(i)[j].equals(options.get(key))) {
//                             cont++;
//                         }
//                     }
//                 }
//                 if(cont >= options.size()) {
//                     results_mult.add(csvData.get(i));
//                 } else if (cont > 0) {
//                     results.add(csvData.get(i));
//                 }
//             }
    
//             if(results_mult.size() > 0) {
//                 csvData = results_mult;
//             } else {
//                 csvData = results;
//             }
//         }

//         List<Map<String, String>> output = new ArrayList<Map<String, String>>();

//         for(int i = 0; i < csvData.size(); i++) {
//             Map<String, String> mapped = new HashMap<String, String> ();
//             mapped.put("permalink", csvData.get(i)[0]);
//             mapped.put("company_name", csvData.get(i)[1]);
//             mapped.put("number_employees", csvData.get(i)[2]);
//             mapped.put("category", csvData.get(i)[3]);
//             mapped.put("city", csvData.get(i)[4]);
//             mapped.put("state", csvData.get(i)[5]);
//             mapped.put("funded_date", csvData.get(i)[6]);
//             mapped.put("raised_amount", csvData.get(i)[7]);
//             mapped.put("raised_currency", csvData.get(i)[8]);
//             mapped.put("round", csvData.get(i)[9]);
//             output.add(mapped);
//         }

//         return output;
//     }

//     public static Map<String, String> findBy(Map<String, String> options) throws IOException, NoSuchEntryException {
//         List<String[]> csvData = new ArrayList<String[]>();
//         CSVReader reader = new CSVReader(new FileReader("startup_funding.csv"));
//         String[] row = null;

//         while((row = reader.readNext()) != null) {
//             csvData.add(row);
//         }

//         reader.close();
//         csvData.remove(0);
//         Map<String, String> mapped = new HashMap<String, String> ();

//         for(int i = 0; i < csvData.size(); i++) {
//             if(options.containsKey("company_name")) {
//                 if(csvData.get(i)[1].equals(options.get("company_name"))) {
//                     mapped.put("permalink", csvData.get(i)[0]);
//                     mapped.put("company_name", csvData.get(i)[1]);
//                     mapped.put("number_employees", csvData.get(i)[2]);
//                     System.out.println(csvData.get(i)[2]);
//                     mapped.put("category", csvData.get(i)[3]);
//                     mapped.put("city", csvData.get(i)[4]);
//                     mapped.put("state", csvData.get(i)[5]);
//                     mapped.put("funded_date", csvData.get(i)[6]);
//                     mapped.put("raised_amount", csvData.get(i)[7]);
//                     mapped.put("raised_currency", csvData.get(i)[8]);
//                     mapped.put("round", csvData.get(i)[9]);
//                 } else {
//                     continue;
//                 }
//             }
//             if(options.containsKey("city")) {
//                 if(csvData.get(i)[4].equals(options.get("city"))) {
//                     mapped.put("permalink", csvData.get(i)[0]);
//                     mapped.put("company_name", csvData.get(i)[1]);
//                     mapped.put("number_employees", csvData.get(i)[2]);
//                     System.out.println(csvData.get(i)[2]+" 1");
//                     mapped.put("category", csvData.get(i)[3]);
//                     mapped.put("city", csvData.get(i)[4]);
//                     mapped.put("state", csvData.get(i)[5]);
//                     mapped.put("funded_date", csvData.get(i)[6]);
//                     mapped.put("raised_amount", csvData.get(i)[7]);
//                     mapped.put("raised_currency", csvData.get(i)[8]);
//                     mapped.put("round", csvData.get(i)[9]);
//                 } else {
//                     continue;
//                 }
//             }

//             if(options.containsKey("state")) {
//                 if(csvData.get(i)[5].equals(options.get("state"))) {
//                     mapped.put("permalink", csvData.get(i)[0]);
//                     mapped.put("company_name", csvData.get(i)[1]);
//                     mapped.put("number_employees", csvData.get(i)[2]);
//                     System.out.println(csvData.get(i)[2]+" 2");
//                     mapped.put("category", csvData.get(i)[3]);
//                     mapped.put("city", csvData.get(i)[4]);
//                     mapped.put("state", csvData.get(i)[5]);
//                     mapped.put("funded_date", csvData.get(i)[6]);
//                     mapped.put("raised_amount", csvData.get(i)[7]);
//                     mapped.put("raised_currency", csvData.get(i)[8]);
//                     mapped.put("round", csvData.get(i)[9]);
//                 } else {
//                     continue;
//                 }
//             }

//             if(options.containsKey("round")) {
//                 if(csvData.get(i)[9].equals(options.get("round"))) {
//                     mapped.put("permalink", csvData.get(i)[0]);
//                     mapped.put("company_name", csvData.get(i)[1]);
//                     mapped.put("number_employees", csvData.get(i)[2]);
//                     System.out.println(csvData.get(i)[2]+" 3");
//                     mapped.put("category", csvData.get(i)[3]);
//                     mapped.put("city", csvData.get(i)[4]);
//                     mapped.put("state", csvData.get(i)[5]);
//                     mapped.put("funded_date", csvData.get(i)[6]);
//                     mapped.put("raised_amount", csvData.get(i)[7]);
//                     mapped.put("raised_currency", csvData.get(i)[8]);
//                     mapped.put("round", csvData.get(i)[9]);
//                 } else {
//                     continue;
//                 }
//             }

//             return mapped;
//         }

//         throw new NoSuchEntryException();
//     }

//     public static void main(String[] args) {
//         try {
//             Map<String, String> options = new HashMap<String, String> ();
//             options.put("company_name", "Facebook");
//             options.put("round", "a");
//             // // Pegando todas as chaves
//             Set<String> keys = options.keySet();
            
//             // // Iterando pelas chaves e acessando os valores
//             // for (int i = 0;i<keys.size();i++) {
//             //     String value = options.get(keys);
//             //     System.out.println("Chave: " + key + ", Valor: " + value);
//             // }
//             System.out.print(FundingRaised.where(options).size());
//         } catch(IOException e) {
//             System.out.print(e.getMessage());
//             System.out.print("error");
//         }
//         // } catch(Error e) {
//         //     System.out.print(e.getMessage());
//         //     System.out.print("error");
//         // }
//     }
// }

// class NoSuchEntryException extends Exception {}

package com.checkr.interviews;

import java.util.*;

import java.io.IOException;

public class FundingRaised {

    public static List<Map<String, String>> where(Map<String, String> options) throws IOException {
        List<String[]> csvData = CarregadorDeCsv.loadCsvData();
        csvData = FiltroDeDados.filterData(csvData, options);
        return MapiadorDeDados.mapData(csvData);
    }

    public static Map<String, String> findBy(Map<String, String> options) throws IOException, NoSuchEntryException {
        List<String[]> csvData = CarregadorDeCsv.loadCsvData();
        List<String[]> filteredData = FiltroDeDados.filterData(csvData, options);

        if (filteredData.isEmpty()) {
            throw new NoSuchEntryException();
        }

        return MapiadorDeDados.mapSingleEntry(filteredData.get(0));
    }

    
}

class NoSuchEntryException extends Exception {}
