/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.CalculateAndBMIDao;

/**
 *
 * @author DELL
 */
public class CalculateAndBMIRepository implements InterfaceCalculateAndBMIRepository {

    @Override
    public void calculate() {
        CalculateAndBMIDao.Instance().normalCalculator();
    }

    @Override
    public void BMI() {
        CalculateAndBMIDao.Instance().BMICalculator();
    }
    
}
