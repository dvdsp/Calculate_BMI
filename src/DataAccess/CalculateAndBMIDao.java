/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import common.Library;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CalculateAndBMIDao {
    private static CalculateAndBMIDao instance = null;
    public static CalculateAndBMIDao Instance() {
        if (instance == null) {
            synchronized (CalculateAndBMIDao.class) {
                if (instance == null) {
                    instance = new CalculateAndBMIDao();
                }
            }
        }
        return instance;
    }
    
    
    public double inputDouble() {
        System.out.print("Enter number: ");
        double n = new Scanner(System.in).nextDouble();
        return n;
    }
    
    public void normalCalculator() {
        double memory;
        System.out.print("Enter number: ");
        memory = Library.checkInputDouble();
        
            System.out.print("Enter operator: ");
            String operator = Library.checkInputOperator();
            switch (operator) {
                case "+":
                    memory += inputDouble();
                    System.out.println("Memory: " + memory);
                    break;
                case "-":
                    memory -= inputDouble();
                    System.out.println("Memory: " + memory);
                    break;
                case "*":
                    memory /= inputDouble();
                    System.out.println("Memory: " + memory);
                    break;
                case "/":
                    memory /= inputDouble();
                    System.out.println("Memory: " + memory);
                    break;
                case "=":
                    System.out.println("Result: " + memory);
                    return;
            
        }

    }

    //display result BMI status
    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }
    
    
    public void BMICalculator() {
        System.out.print("Enter your weight(kg):  ");
        double weight = Library.checkInputDouble();
        System.out.print("Enter your height(cm):  ");
        double height = Library.checkInputDouble();
        double bmi = weight * 10000 / (height * height);
        System.out.format("Your BMI: %.3f\n", bmi);
        System.out.println("Your BMI status:    " + BMIstatus(bmi));
        
    }
    
    public String BMIstatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.Your body is not balance";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.Good";
        } else if (bmi >= 25 && bmi < 30) {
            return "A bit Overweight.Should work-out";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "So fat - should lose weight immediately. SOS!!!";
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
