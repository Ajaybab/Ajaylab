/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
import java.util.Scanner;

public class Salestax {
    public static void main(String[] args) {
        final double Statetaxpercentage = 0.04;
        final double Countystatepercentage = 0.02;
        
        double PurchaseAmount;
        double countyTax;
        double stateTax;
        double totalTax;
        double totalSale;  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the purchase amount: ");
        PurchaseAmount = scanner.nextDouble();
        countyTax = Countystatepercentage * PurchaseAmount;
        stateTax = Statetaxpercentage * PurchaseAmount;
        totalTax = stateTax + countyTax;
        totalSale = totalTax + PurchaseAmount;
        System.out.println( "PurchaseAmount: "+ PurchaseAmount + "\n State Sales Tax: " + stateTax + " \n County Sales Tax: " + countyTax + "\n Total Sales Tax: " + totalTax + "\n Total  Sale: " + totalSale);
               
        
    }
    
}
