package com.example.project;

public class IdGenerate {
    // This class contains static variables and methods, you do not initialize an object to use it.

    // requires 1 private attribute String currentId. You must initialize it to 99
    private static String currentId = "99";

    // requires one empty constructor
    private IdGenerate() {}

    public static String getCurrentId() {
        return currentId; // Get current ID
    }

    public static void reset() {
        currentId = "99"; // Reset current ID
    }

    public static void generateID() {
        int id = Integer.parseInt(currentId); // Convert to integer
        id++; // Increment ID
        currentId = "" + id; // Convert back to string
    } // generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
}
