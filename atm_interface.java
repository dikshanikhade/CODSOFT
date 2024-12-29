package Codsoft;
import java.util.Scanner;
class ATM {
    int balance;
    //Constructor
     public ATM(int balance){
        this.balance = balance;
    }
    //Method to check Balance
    void checkbalance(){
        System.out.println("Your Current Balance : " +balance);
    }
    // Method to deposit money
    void deposit(double amount){
        if(amount>0){
         balance +=amount;
            System.out.println("Amount "+amount+" Deposited succssfully");
        }
        else {
            System.out.println("Invalid Amount Deposit");
        }
        System.out.println("Your Current Balance : "+balance);   
    }
    //Method to withdraw money
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
         balance -=amount;
            System.out.println("Amount "+amount +" Withdraw succssfully");
        }
        else if(amount<=0){
            System.out.println("Invalid Amount Withdraw");
        }
        else {
            System.out.println("Insufficient balance");
        } 
        System.out.println("Your Current Balance : "+balance);     
    }
}        
public class atm_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm= new ATM(500);
        System.out.println("-------------- Welcome ---------------");
        while(true){
        System.out.println("-----Please Select an Option-----");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");
        System.out.print("Select an option : ");
        int select = sc.nextInt();
           if (select ==1){
            atm.checkbalance();
            System.out.println();
           }
           else if(select == 2){
            System.out.print("Enter the amount to Deposit: ");
              int depositAmount =sc.nextInt();
                atm.deposit(depositAmount);
                System.out.println();
           }
           else if(select == 3){
            System.out.print("Enter the amount to Withdraw: ");
               int withdrawAmount =sc.nextInt();
                 atm.withdraw(withdrawAmount);
                 System.out.println();
           }
           else if(select == 4) {
            System.out.println("------------- Thank You! --------------");
            break;
           }
        }   
    }
}
    
    

