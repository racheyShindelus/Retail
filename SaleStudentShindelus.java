/*
Name: Rachel Shindelus
Date: 12/16/2022
Description: This program takes the information of salespeople at a company including their base salary, 
             commission, and first and last name to calculate their monthly pay. 
Self Grade: I believe I should receive 100% for this assignment as I have completed every 
            requirement, it outputs the desired outcome, and is well-commented. 
*/

import java.util.*;

public class SaleStudentShindelus  { /* no code here */}
class Employee {
  // PRIVATE INSTANCE VARIABLES
  private String firstName;         // string holds first name
  private String lastName;          // String holds last name
  private double baseSalary;        // double holds base salary
  private double commissionRate;    // double holds commission rate
  private double employeeSales;     // double holds sales made by employee throughout the month
  
  // CONSTRUCTOR
  // Initializes instance variables to the given parameters
  public Employee (String E_firstName, String E_lastName, double E_baseSalary, double E_commissionRate)  {
   firstName = E_firstName;    
   lastName = E_lastName;
   baseSalary = E_baseSalary;
   commissionRate = E_commissionRate;
   employeeSales = 0;                     // Sets instance variable sales to 0
  }
  
   // GETTER METHODS: implement all the getter methods
   public String getFirst()   {
      return this.firstName;
   }  
   public String getLast() {
      return this.lastName;
   }
   public double getBaseSalary() {
      return this.baseSalary;
   }
   public double getCommission() {
      return this.commissionRate;
   }
       
   // SETTER METHODS: implement all the setter methods
   public void setBaseSalary(double E_baseSalary)  {
      this.baseSalary = E_baseSalary;
   }
   public void setFirst(String E_firstName) {
      this.firstName = E_firstName;
   }
   public void setLastName(String E_lastName)   {
      this.lastName = E_lastName;
   }
   public void setCommission(double E_commissionRate) {
      this.commissionRate = E_commissionRate;
   }
   
   // CALCULATES COMMISSION METHOD
   // Calculates the amount of commission the salesperson should get
   public double calculateCommission()    {
     double commissionGiven = 0;       // Declare a variable to hold the commission amount to be calculated
     commissionGiven = employeeSales * commissionRate / 100;   // Given formula to calculate commission
     return  commissionGiven;    // Return calculated amount
   }
   
   // GET MONTHLY PAID METHOD   
   // Calculates the total monthly pay by calling the calculateCommission that the person recieved
   public double getMonthlyPaid()    {
      double totalPay = 0;
      totalPay = baseSalary + calculateCommission();
      return totalPay;
   }
   
   // SALE METHOD
   // This method is called every time the employeee has a new sale
   public void sale(double amount)   {
     employeeSales += amount;       // Adds the amount to the total employee sales
  }
  
   // REDUCING THE SALE METHOD
   // Reduces the amount of sale if a customer returns a product
   public void reduceSale(double amount)   {
     employeeSales -= amount;       // Subtracts the amount from the total employee sales
   }
   
   // TO STRING() METHOD
   // Returns a string representing an object to display employee information
   public String toString()   {
     String s = "";
     System.out.println("\nFirst: " + firstName);
     System.out.println("Last: " + lastName);
     System.out.println("Base Salary: " + baseSalary);
     System.out.print("Sales Amount: " + employeeSales);
     return s;
   }
}

/**************************************************************************************
Once you implement the Employee class, compile it, then uncommnet the diver below to test your code. 
Do not remove this driver when you submit your code
/****************************************************************************************/
/*class MyDriver {
   public static void main(String[] args)   {
     // (String first, String last, double baseSalary, double commission)
     // creating objecs of Employee
     Employee e1 = new Employee("Alex","Rodriguze",3000, 5);
    
     //sales for employee e1: alex
     e1.sale(2000);
     e1.sale(5000);
     e1.sale(3000);
     e1.sale(1200);
     
     //an item is returned thefore the sale amount must be adjusted
     e1.reduceSale(5000);
     
     //another item is sold by Alex
     e1.sale(345);
      
     //calling the commission method to calculate the amount of the commission
     double commission = e1.calculateCommission();
     
     //calling the method to calculate the total pay 
     double pay = e1.getMonthlyPaid();
     
     //displaying the info about employee e1
     System.out.println(e1.toString());
     System.out.println("The commission you made: " + commission);
     System.out.println("Total paid this month: " + pay);
   }
} */

/**********************************************************************
Once your code works with the given driver then create 3 Objects of employee of your choice
create similar code given in the MyDriver class for each of the objects This driver has 15 points 
**************************************************************************/
 class yourDriver {
   public static void main(String[] args)   {
     // FIRST OBJECT
     Employee e1 = new Employee("Beatrice", "Schidler", 2500, 8);
      // e1 Sales:
      e1.sale(1500);
      e1.sale(2300);
      e1.sale(2600);
      e1.sale(2750);
      e1.sale(1950);
      //e1 Returns
      e1.reduceSale(2750);
      e1.reduceSale(2300);
      // Commissions
      double commission = e1.calculateCommission();
      // Total Pay
      double pay = e1.getMonthlyPaid();
      // Display Employee Info
      System.out.println(e1.toString());
      System.out.println("The commission you made: " + commission);
      System.out.println("Total paid this month: " + pay);
      
     //****************************
     // SECOND OBJECT
     Employee e2 = new Employee("Cam", "Thompson", 3200, 3);
      // e2 Sales:
      e2.sale(2500);
      e2.sale(1300);
      e2.sale(1900);
      e2.sale(2150);
      e2.sale(1850);
      // e2 Returns
      e2.reduceSale(2500);
      e2.reduceSale(1300);
      // Commissions
      commission = e2.calculateCommission();
      // Total Pay
      pay = e2.getMonthlyPaid();
      // Display Employee Info
      System.out.println(e2.toString());
      System.out.println("The commission you made: " + commission);
      System.out.println("Total paid this month: " + pay);
      
     //*****************************************
     // THIRD OBJECT
     Employee e3 = new Employee("Dimitry","Uraldee",2750, 4);
     // e3 Sales:
      e3.sale(1750);
      e3.sale(2250);
      e3.sale(2325);
      e3.sale(1975);
      e3.sale(3250);
      e3.sale(1250);
      e3.sale(1025);
      // e3 Returns
      e3.reduceSale(1750);
      // Commissions
      commission = e3.calculateCommission();
      // Total Pay
      pay = e3.getMonthlyPaid();
      // Display Employee Info
      System.out.println(e3.toString());
      System.out.println("The commission you made: " + commission);
      System.out.println("Total paid this month: " + pay);
   }  
}