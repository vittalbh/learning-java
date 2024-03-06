package com.learning;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    /**
    public ListOfNumbers() {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(Integer.valueOf(i));
        }
    } */

    /**
     *
     * @param size

    public ListOfNumbers(int size) {
        list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(Integer.valueOf(i));
        }
    }*/

    public void writeList() {
        // The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = null;
        try {
            System.out.println("Entering" + " try statement");

            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < list.size(); i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: "
                    + e.getMessage());

        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());

        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }


    }

    static String readFirstLineFromFile(String path) {
        String firstLine = null;
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            firstLine = br.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } 
        return firstLine;
    }

    public static void viewTable(Connection con) {

        String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");

                System.out.println(coffeeName + ", " + supplierID + ", " +
                        price + ", " + sales + ", " + total);
            }
        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void main(String[] args) {
        //ListOfNumbers listOfNumbers = new ListOfNumbers();
        //listOfNumbers.writeList();
        //readFirstLineFromFile("OutFile.txt");
        //viewTable(null);


        ListOfNumbers listOfNumbers2 = new ListOfNumbers();
        listOfNumbers2.writeList();
        readFirstLineFromFile("OutFile.txt");
    }
}
