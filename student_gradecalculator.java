package Codsoft;
import java.util.Scanner;
class Subject {
    int[] marks;

    public Subject(int[] marks){  
        this.marks = marks;
    }
    //Method to calculate Total Marks
    public int calculateTotalMarks(){
      int total =0;
      for(int mark : marks){
        total += mark;
      }
      return total;
    }
    //Method to calculate Average Percentage
    public int calculateAvgPercentage(){
       int totalmarks = calculateTotalMarks();
        return totalmarks / marks.length;
    }
    //Method to calculate Grade
    public String calculateGrade(){
    double avgpercentage = calculateAvgPercentage();
        if(avgpercentage >= 90){
           return"A+";
           }
        else if(avgpercentage >= 80){
            return"B";
            }
           else if(avgpercentage >= 70){
                return"C";
                } 
                else{
                    return"D";
                }    
  }
//Method to Display Result
    public void display(){
        System.out.println("Total Marks        : "+calculateTotalMarks());
        System.out.println("Average Percentage : "+calculateAvgPercentage()+"%");
        System.out.println("Grade Obtained     : "+calculateGrade()); 
    }
}
public class student_gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of Subjects : ");
        int numofsub = sc.nextInt();
        int[] marks = new int[numofsub];
            for(int i = 0; i<numofsub; i++){
                System.out.print("Enter Marks of Subject "+(i+1)+"(Out of 100): ");
                   marks[i] = sc.nextInt();
            }
        //Display result
        System.out.println("--------------GRADE REPORT--------------");
        Subject subject = new Subject(marks);
        subject.display();
    }
}  

