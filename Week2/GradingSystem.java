
import java.util.Scanner;
public class grading_systems {
    static String classifyMark(int mark){
        if(mark>=80 && mark<=100){
            return "Distinction";
        }
        else if(mark>=70 && mark<80){
            return "merit";
        }
        else if(mark>=50 && mark<70){
            return "pass";
        }
        else if(mark>=0 && mark<50){
            return "fail";
        }
        else{
            return "invalid input";
        }
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
       System.out.println(classifyMark(marks));
    }
}
