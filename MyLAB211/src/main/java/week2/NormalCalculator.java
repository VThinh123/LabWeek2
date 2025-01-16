/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO LEGION
 */
public class NormalCalculator {
    private double number1;
    private double number2;

    public NormalCalculator() {
    }
    
    double calculate(double x, double y, String op){
        switch(op){
            case "+": return x + y;
            case "-": return x - y;
            case "*": return x * y;
            case "/": return x / y;
        }
        return 0;
    }
    
    double calculateBMI(double weight, double height){
        return weight / (height*height);
    }
    
}
