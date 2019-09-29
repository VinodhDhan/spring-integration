package com.vin.filesystemintegration;

import java.io.*;

public class FilePrinter {

    public void print(File file) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));

            String line = "";

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


    public void print(String file) {
        System.out.println("Invoking print method with a string");
        System.out.println(file);
    }


}
