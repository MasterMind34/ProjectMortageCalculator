import java.util.Scanner;
import java.text.NumberFormat;

/**
* This is the main method for the morgage calculator.
* 
* @author Joseph Liddell 
*/

public class Mortage
{
   public static void main(String [] args){
                    
        
   int Principal =(int)Console.readNumber("Principal:",1000, 1_000_000);
   float annualInterest = (float)Console.readNumber("Annual Interest Rate:" ,1 ,30);
   byte  years = (byte) Console.readNumber("Period(Years): ",1,30);
   var calculator = new MortageCalculator(Principal,annualInterest,years);
   var report = new MortageReport(calculator);
   
  
      report.printMortage();
      report.printPaymentSchedule(years);  
                  
   }
   
                 
          
      }