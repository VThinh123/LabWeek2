/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO LEGION
 */
public abstract class Shape {

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract void printResult();
}

class Circle extends Shape {

    private double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Perimeter: %.2f%n", getPerimeter());
        System.out.printf("Area: %.2f%n", getArea());
    }
}

class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.printf("width: %.2f%n", width);
        System.out.printf("length: %.2f%n", length);
        System.out.printf("Area: %.2f%n", getArea());
        System.out.printf("Perimeter: %.2f%n", getPerimeter());
    }
}

class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.printf("sideA: %.2f%n", sideA);
        System.out.printf("sideB: %.2f%n", sideB);
        System.out.printf("sideC: %.2f%n", sideC);
        System.out.printf("Area: %.2f%n", getArea());
        System.out.printf("Perimeter: %.2f%n", getPerimeter());
    }
}
