import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FixedPayment {
    
    private static DecimalFormat df = new DecimalFormat("0.00");
     
    public static void main(String args[]) {
        double balance = 4773; 
        double annualInterestRate = 0.2;
        double fixedMinimumPayment = 10;
        double netBalance = balance;
        
        while(netBalance > 0){
            for(int i = 0; i < 12; i++){
                double unPaidBalance = netBalance - fixedMinimumPayment;
                double interest = (annualInterestRate / 12.0 ) * unPaidBalance;
                netBalance = unPaidBalance + interest;
                }
        if(netBalance > 0){
                netBalance = balance;
                fixedMinimumPayment += 10;
        }
        }
        System.out.println("Minimum Payment per month (Fixed): "+df.format(fixedMinimumPayment));
    }
    }