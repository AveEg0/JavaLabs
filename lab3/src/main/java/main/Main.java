package main;

import java.util.Scanner;

/**
 * This program changes case of characters of the entered string
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isUpperCase(chars[i])) chars[i] = Character.toUpperCase(chars[i]);
            else chars[i] = Character.toLowerCase(chars[i]);
        }
        StringBuilder builder = new StringBuilder();
        for(char c:chars) builder.append(c);
        System.out.println("Changed string");
        System.out.println(builder);
    }
}
