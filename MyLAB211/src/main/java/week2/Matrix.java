
package week2;

import java.util.Scanner;

public class Matrix {

    private final int SIZE = 50;
    private int rows;
    private int columns;
    private int a[][];

    public Matrix() {
        this.rows = 0;
        this.columns = 0;
        this.a = new int[SIZE][SIZE];
    }

    boolean checkValue(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    int getValidNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter a valid number: ");
            String input = scanner.nextLine();

            if (checkValue(input)) {
                return Integer.parseInt(input);
            } else {
                System.out.println("Value must be a number.");
            }
        }
    }

void EnterMatrix() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter columns: ");
    columns = getValidNumber(sc);
    System.out.print("Enter rows: ");
    rows = getValidNumber(sc);
    a = new int[rows][columns];

    System.out.println("Enter value of matrix:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print("\tEnter Matrix [" + (i + 1) + "][" + (j + 1) + "]: ");
            String value = sc.nextLine();
            if (checkValue(value)) {
                a[i][j] = Integer.parseInt(value);
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                j--;
            }
        }
    }
}


    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix mt2) {
        if (this.rows != mt2.rows || this.columns != mt2.columns) {
            System.out.println("Matrix dimensions must be the same for addition.");
            return null;
        }
        Matrix sum = new Matrix();
        sum.rows = this.rows;
        sum.columns = this.columns;
        sum.a = new int[sum.rows][sum.columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum.a[i][j] = a[i][j] + mt2.a[i][j];
            }
        }
        return sum;
    }


    public Matrix sub(Matrix mt2) {
        if (this.rows != mt2.rows || this.columns != mt2.columns) {
            System.out.println("Matrix dimensions must be the same for subtraction.");
            return null;
        }
        Matrix sub = new Matrix();
        sub.rows = this.rows;
        sub.columns = this.columns;
        sub.a = new int[sub.rows][sub.columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sub.a[i][j] = a[i][j] - mt2.a[i][j];
            }
        }
        return sub;
    }

    public Matrix mul(Matrix mt2) {
        if (this.columns != mt2.rows) {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
            return null;
        }
        Matrix mul = new Matrix();
        mul.rows = this.rows;
        mul.columns = mt2.columns;
        mul.a = new int[mul.rows][mul.columns];

        for (int i = 0; i < mul.rows; i++) {
            for (int j = 0; j < mul.columns; j++) {
                mul.a[i][j] = 0;
                for (int k = 0; k < this.columns; k++) {
                    mul.a[i][j] += a[i][k] * mt2.a[k][j];
                }
            }
        }
        return mul;
    }
}