package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 * <p>
 */
public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        Map<String, List<String>> userPreferences = new HashMap<>();
        String activeUser = null;

        while ((line = in.readLine()) != null) {
            String[] splitted = line.split(":");
            if (splitted.length != 2) continue;

            String userName = splitted[0].trim();

            List<String> preferences = Arrays.asList(splitted[1].split(","));
            userPreferences.put(userName, preferences);

            if (activeUser == null) {
                activeUser = userName;
            }

//            System.out.println(line);
        }


    }
}
