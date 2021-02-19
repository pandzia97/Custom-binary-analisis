package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File("input.txt"));
        String input = readFile.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        int quantity = input.length() / 8;
        int failSum = 0;

        for (int i = 0; i < quantity; i++) {

            final int firstIndex = 8 * i;
            String single = input.substring(firstIndex, firstIndex + 8);
            String id = single.substring(0, 3); // 0, 1, 2, 3
            String message = single.substring(4, 7); // 4,5,6
            String control = single.substring(7); // 7

            if (message.equals("000") || !id.endsWith(control)) {
                failSum++;
            } else {
                stringBuilder.append(single);
            }
        }

        PrintWriter printWriter = new PrintWriter("output.txt");

        printWriter.println(quantity);
        printWriter.println(failSum);
        printWriter.println(stringBuilder);
        printWriter.close();

/*        System.out.println(quantity);
        System.out.println(failSum);
        System.out.println(stringBuilder);*/
    }
}
