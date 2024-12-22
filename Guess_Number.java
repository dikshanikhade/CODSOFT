package Codsoft;
import java.util.Scanner;
public class Guess_Number {
        public static void guess_number() {
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter a Random Number: ");
            int num = Sc.nextInt();
            int trials = 3;
            int i,guess ;
            System.out.println("A number is chosen between 1 to 100 ");
            System.out.println("Guess the number within  three trails");
            for(i =0;i<trials;i++){
                System.out.print("Guess the number: ");
                //Scanner Sc = new Scanner(System.in);
                guess= Sc.nextInt();
                if(num == guess){
                    System.out.println("You win the Game");
                    break;
                }
                else if(num > guess && i!=trials-1){
                    System.out.println(" Guess is Low");
                }
                else if(num < guess && i!=trials-1){
                    System.out.println(" Guess is High");
                }
            } 
            if(i == trials) {
                System.out.println(" You Lost the Game");
            }
        }
    public static void main(String[] args) {
        System.out.println("------Let's Start the Game------");
        guess_number();
        System.out.println("------Game Over------");
    }
}
    

