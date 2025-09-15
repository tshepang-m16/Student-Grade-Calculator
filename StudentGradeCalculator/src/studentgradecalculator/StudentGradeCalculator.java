

package studentgradecalculator;
import java.util.Scanner;


public class StudentGradeCalculator {

   
    public static void main(String[] args) {
        //SCANNER OBJECT TO COLLECT INPUT
        Scanner scanner = new Scanner ( System.in);
        
        // DECLARE AND ACCEPT INPUT
        
        System.out.println ("Enter student name: ");
        String studentname = scanner.nextLine();
        
            System.out.println ("Enter student's first test score: ");
               double firsttest = scanner.nextDouble();
            System.out.println ("Enter student's second test score: ");
            double secondtest = scanner.nextDouble();
            System.out.println("Enter student's third test score: ");
            double thirdtest = scanner.nextDouble();
            
            //calculate the marks 
            int totalmarks = (int) (firsttest + secondtest + thirdtest);
            double averagemark = totalmarks / 3.0;
            
            // display results 
            System.out.println ("\n--- Student Report ---");
            System.out.println ("Studentname: " + studentname);
            System.out.println ("Total Marks: " + totalmarks);
            System.out.println ("Average Mark: " + averagemark);
            
            
  
    }
    
}
