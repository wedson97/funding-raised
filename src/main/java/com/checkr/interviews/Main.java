package com.checkr.interviews;

import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, String> options = new HashMap<>();
            options.put("company_name", "Facebook");
            options.put("round", "a");

            System.out.print(FundingRaised.where(options).size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Error e) {
            System.out.println("No entry found.");
        }
    }
}
