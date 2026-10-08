import java.util.Scanner;

public class MethodsInJava {

    static int currentBalance = 1000;


    public static void Greetings() {
        System.out.println("Welcome to the HDFC BANK");
    }


    public static void Deposit(int amount) {

        currentBalance = currentBalance + amount;
        System.out.println(" Amount Deposited successfully " + amount);

    }

    public static void Withdraw(int amount) {

        currentBalance = currentBalance - amount;
        System.out.println(" Amount Withdrawn successfully " + amount);
    }
    public static int  getCurrentBalance()
    {
        return MethodsInJava.currentBalance;
    }

    public static void main(String args[])
    {


        MethodsInJava obj = new MethodsInJava();

        System.out.println("Current Balance is " + getCurrentBalance());

        Greetings();

        Scanner input = new Scanner(System.in);
        int depositAmount = input.nextInt();

        MethodsInJava.Deposit(depositAmount);
        System.out.println("Current Balance is " + getCurrentBalance());

        int  withdrawAmount = input.nextInt();
        MethodsInJava.Withdraw(withdrawAmount );

        System.out.println("Current Balance is " + getCurrentBalance());

        getCurrentBalance();




    }




}
