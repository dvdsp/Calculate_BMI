/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.CalculateAndBMIRepository;
import Repository.InterfaceCalculateAndBMIRepository;
import common.Library;
import java.util.Scanner;
import view.Menu;

/**
 *
 * @author DELL
 */
public class ComputerProgramBMI_Manager extends Menu<String> {
    static String[] mc = {"Normal Calculator", "BMI Calculator", "exit"};
    protected InterfaceCalculateAndBMIRepository repo;
    Library valid;
    
    public ComputerProgramBMI_Manager() {
        super("\tUtilities", mc);
        repo = new CalculateAndBMIRepository();
        valid = new Library();
    }
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1-> repo.calculate();
            case 2-> repo.BMI();
            case 3-> System.exit(0);
        }
    }
    

    
    
}
