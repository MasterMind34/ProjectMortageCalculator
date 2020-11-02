import java.text.NumberFormat;
public class MortageReport{

private  MortageCalculator calculator;
private final NumberFormat currency;

public MortageReport(MortageCalculator calculator){
this.calculator = calculator;
currency = NumberFormat.getCurrencyInstance();

}
/*
*This method prints the mortage
*/

 public void printMortage(){
     double mortage = calculator.calculateMortage();     
     String  mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
     System.out.println();
     System.out.println("MORTAGE");
     System.out.println("--------");   
      System.out.println("MonthlyPayments:" +"" + mortageFormatted);
      }
          

/*
*This method prints the payment schedule
*/
 public  void printPaymentSchedule(byte years){
      System.out.println();
      System.out.println("Payments Schedule");
      System.out.println("------------------");
      for( double balance:calculator.getRemainingBalance())
      System.out.println(currency.format(balance));

      
         }




}