import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Balance {
    
    private static DecimalFormat df = new DecimalFormat("0.00");
     
    public static void main(String args[]) {
        double balance = 42; 
        double annualInterestRate = 0.2; 
        double monthlyPaymentRate = 0.04;
        for(int i=0; i < 12; i++){
            double minimumPayment = balance * monthlyPaymentRate;
            double unPaidBalance = balance - minimumPayment;
            double interest = (annualInterestRate / 12.0 ) * unPaidBalance;
            balance = unPaidBalance + interest;
        }
        System.out.println("Reamining balance: "+df.format(balance));
    }
}