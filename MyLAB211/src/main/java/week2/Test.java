/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.ArrayList;
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

    static void docalculator(Scanner sc) {
        NormalCalculator normalCalculator = new NormalCalculator();
        System.out.println("Input number: ");
        double num = sc.nextDouble();
        sc.nextLine();
        double temp = num;
        while (true) {
            System.out.println("Input operator: ");
            String op = sc.nextLine();
            if (op.equals("=")) {
                System.out.println("Last value: " + temp);
                return;
            }
            System.out.println("Input number: ");
            num = sc.nextDouble();
            sc.nextLine();
            temp = normalCalculator.calculate(temp, num, op);
            System.out.println("Value: " + temp);
        }
    }

    static void docalculateBMI(Scanner sc) {
        NormalCalculator normalCalculator = new NormalCalculator();
        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        double BMI = normalCalculator.calculateBMI(weight, height);
        System.out.println("Your BMI is: " + BMI);
        if (BMI < 19) {
            System.out.println("Under-standard:");
        } else if (BMI >= 19 && BMI < 25) {
            System.out.println("Standard:");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Overweight:");
        } else if (BMI >= 30 && BMI < 40) {
            System.out.println("Fat - should lose weight");
        } else {
            System.out.println("Very fat - should lose weight immediately");
        }
    }

    public void NormalCalculate() {
        Test menu = new Test("Menu", new String[]{"Normal caculator", "Calculate BMI", "Exit"});
        menu.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose option: ");
        int choice;
        do {
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    docalculator(sc);
                    break;
                }
                case 2: {
                    docalculateBMI(sc);
                    break;
                }
                case 3: {
                    System.out.println("Bye!");
                    break;
                }
                default:
                    System.out.println("Enter choice again");
            }
        } while (choice != 3);
    }

    public void CalculateShape() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input side width of Rectangle: ");
        double width = sc.nextDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = sc.nextDouble();
        Shape rectangle = new Rectangle(width, length);

        System.out.print("Please input radius of Circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);

        System.out.print("Please input side A of Triangle: ");
        double sideA = sc.nextDouble();
        System.out.print("Please input side B of Triangle: ");
        double sideB = sc.nextDouble();
        System.out.print("Please input side C of Triangle: ");
        double sideC = sc.nextDouble();
        Shape triangle = new Triangle(sideA, sideB, sideC);

        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }

    public void MatrixOption() {
        Scanner sc = new Scanner(System.in);
        Matrix mx = new Matrix();

        // Khai bao doi tuong
        Matrix mt1 = new Matrix();
        Matrix mt2 = new Matrix();
        Matrix Sum;
        Matrix Mul;
        Matrix Sub;

        System.out.println("Enter first matrix:");
        mt1.EnterMatrix();
        System.out.println("Enter second matrix:");
        mt2.EnterMatrix();
        int choice;
        do {
            Test menu = new Test("Menu", new String[]{"Addition Matrix", "Subtration Matrix", "Multiplication Matrix ", "Quit"});
            menu.display();
            System.out.println("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    mt1.display();
                    System.out.println("\n+\n");
                    mt2.display();
                    Sum = mt1.add(mt2);
                    System.out.println("\n=\n");
                    Sum.display();
                    break;
                }
                case 2: {
                    mt1.display();
                    System.out.println("\n-\n");
                    mt2.display();
                    Sub = mt1.sub(mt2);
                    System.out.println("\n=\n");
                    Sub.display();
                    break;
                }
                case 3: {
                    mt1.display();
                    System.out.println("\n*\n");
                    mt2.display();
                    Mul = mt1.mul(mt2);
                    System.out.println("\n=\n");
                    Mul.display();
                    break;
                }
                case 4:
                    System.out.println("Bye!");
                default:
                    System.out.println("Enter choice again");
            }
        } while (choice != 4);
    }

    public void selectOption(int n) {
        switch (n) {
            case 1: {
                NormalCalculate();
                break;
            }
            case 2: {
                CalculateShape();
                break;
            }
            case 3: {
                MatrixOption();
                break;
            }
            case 4:
                System.out.println("Bye!");
            default:
                System.out.println("Enter choice again: ");
        }
    }

    public static void main(String[] args) {
        Test menu = new Test("Menu", new String[]{"computer program", "calculate perimeter and area", "Matrix", "Exit"});
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            menu.display();
            System.out.println("\nEnter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            menu.selectOption(choice);
        } while (choice != 4);
    }
}
