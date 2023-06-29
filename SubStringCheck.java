package com.assignment;

import java.util.Scanner;

public class SubStringCheck {
    public static boolean isSubstringPresent(String infStr, String toFind) {
        StringBuilder repeatedInfStr = new StringBuilder();
        while (repeatedInfStr.length() < toFind.length()) {
            repeatedInfStr.append(infStr);
        }
        repeatedInfStr.setLength(toFind.length());
        return repeatedInfStr.toString().equals(toFind);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after T

        for (int i = 0; i < T; i++) {
            String[] input = scanner.nextLine().split(" ");
            String infStr = input[0];
            String toFind = input[1];

            boolean isPresent = isSubstringPresent(infStr, toFind);
            if (isPresent) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
	}
