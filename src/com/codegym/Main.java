package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Too students!");
            }
        } while (size > 30);
        int[] a = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a mark for studen " + (i + 1) + " : " + "\t");
            a[i] = scanner.nextInt();
        }

            for (int i = 0; i < a.length; i++) {
                if (a[i] >= 5 && a[i] <=10 ) {
                    count++;
                }
            }
        System.out.println("The number of students pass the exam is:" + count);
        }
    }

