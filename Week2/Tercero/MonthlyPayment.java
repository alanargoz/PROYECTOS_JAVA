import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.lang.Math; 

public class MonthlyPayment {
    
    private static DecimalFormat df = new DecimalFormat("0.00");
     
    public static void main(String args[]) {
        double balance = 320000; 
        double annualInterestRate = 0.2;
        double tempBalance = balance;
        double monthlyInterestRate = (annualInterestRate) / 12.0;
        double lowerBound = tempBalance / 12;
        double upperBound = (tempBalance * (1 + Math.pow(monthlyInterestRate,12) ) / 12.0);
        double epsilon = 0.01;
        
        while(Math.abs(balance) > epsilon){
            double monthlyPaymentRate = (upperBound + lowerBound) / 2.0;
            balance = tempBalance;
            int months = 1;
            while (months < 13){
                double interest = (balance - monthlyPaymentRate) * monthlyInterestRate;
                balance = balance + interest - monthlyPaymentRate;
                months += 1;
            }
            if (balance > epsilon){
            lowerBound = monthlyPaymentRate;
            }
            else if (balance < -epsilon){
                upperBound = monthlyPaymentRate;
            }
            else{
                break;
                
            } System.out.println("Minimum Payment per month (Fixed): "+df.format(monthlyPaymentRate));
        
        }
    }
    }