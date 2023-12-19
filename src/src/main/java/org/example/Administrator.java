package org.example;

import java.util.ArrayList;

public class Administrator {
    private boolean authorized;

    public void login() {
        authorized = true;
        System.out.println("Successfully logged in as Administrator.");
    }

    public void addRecord(String record) {
        if (authorized) {
            CourseProject.records.add(record);
            System.out.println("Added record: " + record);
        } else {
            System.out.println("Authorization required. Please log in as Administrator.");
        }
    }

    public void deleteRecord(String record) {
        if (authorized) {
            CourseProject.records.remove(record);
            System.out.println("Deleted record: " + record);
        } else {
            System.out.println("Authorization required. Please log in as Administrator.");
        }
    }

    public void addCategory(String category) {
        if (authorized) {
            CourseProject.categories.put(category, new ArrayList<>());
            System.out.println("Added category: " + category);
        } else {
            System.out.println("Authorization required. Please log in as Administrator.");
        }
    }
}
