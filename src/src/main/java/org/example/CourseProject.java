package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CourseProject {
    static List<String> records = new ArrayList<>();
    static Map<String, List<String>> categories = new HashMap<>();

    public static void main(String[] args) {
        AdministratorInterface administratorInterface = new AdministratorInterface();
        administratorInterface.start();
    }

    public static void printRecords() {
        System.out.println("Records:");
        for (String record : records) {
            System.out.println(record);
        }
        System.out.println();
    }

    public static void printCategories() {
        System.out.println("Categories:");
        for (Map.Entry<String, List<String>> entry : categories.entrySet()) {
            String category = entry.getKey();
            List<String> records = entry.getValue();

            System.out.println(category + ":");
            for (String record : records) {
                System.out.println("- " + record);
            }
            System.out.println();
        }
    }
}