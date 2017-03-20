package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Created by yyakup on 2/2/17.
 */
public class ReaderWriter {

    public static void main(String args[]) {
        ClassLoader classLoader = ReaderWriter.class.getClassLoader();
        InputStream io = classLoader.getResourceAsStream("test.json");
       // File io = new File(ReaderWriter.class.getClass().getClassLoader().getResource("test.json").getFile());
        try {
            Scanner scanner = new Scanner(io);
            while (scanner.hasNextLine()) {
                if(scanner.next().equalsIgnoreCase("name")) {
                    System.out.print(scanner.nextLine());
                }
            }
        } catch (Exception ioex) {

        }

    }

}
