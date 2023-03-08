import java.util.Scanner;

public class CommissionPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weeklyBonus = 200; //declare int for the 200 dollars because the salesperson is receiving 200 dollars per week under no additional condition
        char dollarSign = '$'; //declare char for dollarSign
        System.out.printf("How much %c worth of merchandise did you sell this week? ", dollarSign); //input sold amount 
        int merchandiseSold = input.nextInt(); // store under merchandiseSold

        double commissionWithoutBonus = 0.09*merchandiseSold; // total commission
        double total = commissionWithoutBonus + weeklyBonus; // commission + 200 dollars that they get every week => store under total
        System.out.printf("Your Sales commission for this week totals %c%f", dollarSign,total ); // return total

        input.close(); // close scanner

    }
}