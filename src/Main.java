import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("Enter grades for Students. Type 'done' to finish:");
        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")){
                break;
            }
            try {
                double grade =Double.parseDouble(input);
                grades.add(grade);
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a number or type 'done' to finish.");
            }
        }
        if(grades.isEmpty()){
            System.out.println("No grades were entered.");
        }
        else{
            double total = 0;
            double highest = grades.get(0);
            double lowest = grades.get(0);
            for (double grade: grades){
                total += grade;
                if (grade > highest){
                    highest = grade;
                }
                if (grade < lowest){
                    lowest = grade;
                }
            }
            double average =total / grades.size();

            System.out.printf("Average grade:%.2f\n" ,average);
            System.out.printf("Highest grade:%.2f\n" ,highest);
            System.out.printf("Lowest grade:%.2f\n" ,lowest);
        }
    }
}
