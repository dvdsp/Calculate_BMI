/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class Library {
    
    public static final String PHONE_VALID = "^\\d{10}\\d*$";
    
    public static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-za-z.-]+\\.[A-Za-z]{2,4}$";
    // kiem tra lua chon hop le tu nguoi dung
    
    public static int checkInputChoice (int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int choice = Integer.parseInt( sc.nextLine().trim() );
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch( NumberFormatException e) {
                System.out.format("Please, enter number in range %d - %d \n",min, max );
                System.out.print("Let's try enter again:      ");
            }
        }
    }
    
    public static String checkInputString() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty() ) {
                System.out.println("Can not be empty");
                System.out.print("Let's try enter again:        ");
            } else {
                return result;
            }
        }
    }
    
    
    public static double checkInputDouble() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double choice = Double.parseDouble(sc.nextLine().trim());
                return choice;
            } catch (NumberFormatException e) {
                System.out.print("Must be in double> Enter again: ");
            }
        }
    }
    
    public static String checkInputOperator() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String choice = sc.nextLine().trim();
            if (choice.isEmpty()) {
                System.out.println("Cannot be empty");
            } else if (choice.equalsIgnoreCase("+") || choice.equalsIgnoreCase("-") ||
                        choice.equalsIgnoreCase("*") || choice.equalsIgnoreCase("/") ||
                        choice.equalsIgnoreCase("^") || choice.equalsIgnoreCase("=")
                    ) {
                return choice;
            } else {
                System.out.println("please input operator: + - * / ^");
            }
            System.out.print("Let's enter again:    ");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
