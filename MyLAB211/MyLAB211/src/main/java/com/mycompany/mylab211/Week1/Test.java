/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mylab211.Week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class Test {

    private String title;
    private ArrayList<String> option;

    public Test(String td, String[] mc) {
        title = td;
        option = new ArrayList<>();
        for (String s : mc) {
            option.add(s);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < option.size(); i++) {
            System.out.println((i + 1) + "." + option.get(i));
        }
        System.out.println("--------------------------------");
    }

    public void changeBaseNumber() {
        Test menu = new Test("Menu", new String[]{"Binary to decimal", "Decimal to binary", "decimal to hexadecimal", "Exit"});
        menu.display();
        ChangeBaseNumber change = new ChangeBaseNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1: {
                System.out.println("Enter binary");
                String binary = sc.nextLine();
                int value = change.binaryToDecimal(binary);
                System.out.println("Change to decimal: " + value);
                break;
            }
            case 2: {
                System.out.println("Enter decimal: ");
                String decimal = sc.nextLine();
                String binary = change.decimalToBinary(decimal);
                System.out.println("Change to binary: " + binary);
                break;
            }
            case 3: {
                System.out.println("Enter decimal: ");
                String decimal = sc.nextLine();
                String hexadecimal = change.decimalToHexa(decimal);
                System.out.println("Change to binary: " + hexadecimal);
                break;
            }
        }
    }

    public void calculate() {
        Test menu = new Test("Menu", new String[]{"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"});
        menu.display();
        Calculate cal = new Calculate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1: {
                System.out.println("Enter a:");
                double a = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter b:");
                double b = sc.nextDouble();
                cal.superlativeEquation(a, b);
                break;
            }
            case 2: {
                System.out.println("Enter a:");
                double a = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter b:");
                double b = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter c:");
                double c = sc.nextDouble();
                cal.quadraticEquation(a, b, c);
                break;
            }
        }
    }

    public void selectOption(int n) {
        switch (n) {
            case 1: {
                LinearSearch Lsearch = new LinearSearch();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number of array:");
                int range = sc.nextInt();
                Lsearch.addValue(range);

                System.out.println("Enter search value:");
                int value = sc.nextInt();
                int result = Lsearch.searchValue(value);
                System.out.println("Found " + value + " at index:" + result);
                Lsearch.showArray();
                break;
            }
            case 2: {
                Letter_and_character_count lcc = new Letter_and_character_count();
                System.out.println("Enter you content:");
                Scanner sc = new Scanner(System.in);
                String string = sc.nextLine();
                Map<String, Integer> wordCount = lcc.countWord(string);
                Map<Character, Integer> charCount = lcc.countCharacter(string);
                System.out.println("Word count: " + wordCount);
                System.out.println("Char count: " + charCount);
                break;
            }
            case 3: {
                changeBaseNumber();
                break;
            }
            case 4: {
                calculate();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Test menu = new Test("Menu", new String[]{"linear search", "count letter and character", "change base number system", "find number", "Exit"});
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            menu.display();
            System.out.println("\nEnter your choice:");
            choice = sc.nextInt();
            sc.nextLine();

            menu.selectOption(choice);
        } while (choice > 0 && choice < 5);
    }
}
