

public class MortageCalculator{

private final static byte percent = 100;
private final static byte Months_In_Year = 12; 
private int Principal;
private float annualInterest;
private byte years;


public MortageCalculator(int Principal, float annualInterest, byte years){
 this.Principal = Principal;
 this.annualInterest = annualInterest;
 this.years = years;



}

/**
* This method calculates the monthly balance
* 
* @param number of payments made for an entire month
*/

public double calculateBalance(short numberOfPaymentsMade){
                  
                     
                   float monthlyInterest = getMonthlyInterest();
                   float numberOfPayments = getNumberOfPayments(); 
 
                   
                   double balance = Principal *
                  ( Math.pow(1+monthlyInterest,numberOfPayments)-
                   Math.pow(1 + monthlyInterest,numberOfPaymentsMade)) /
                   (Math.pow(1+ monthlyInterest,numberOfPayments)-1);
                                          
                                           return balance;
                                                                      
                                             }
/*
*This method calculates the mortage
*/


 public  double calculateMortage(){
                                             
                     
                   float monthlyInterest = getMonthlyInterest();
                   float numberOfPayments = getNumberOfPayments(); 
                           
                   double mortage = Principal *
       ( monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments))
       / (Math.pow(1+monthlyInterest,numberOfPayments) -1);
         return mortage;



   }
   
   public double[] getRemainingBalance(){
   var balances = new double [getNumberOfPayments()];
   for(short month = 1; month <= balances.length; month++ )
    balances[month-1] = calculateBalance(month);
 
   return balances;
   }
   
   private float getMonthlyInterest(){
   return annualInterest/percent/Months_In_Year;

         }
         
   private int getNumberOfPayments(){
  return years * Months_In_Year;

      }
   
   





}