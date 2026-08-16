package question_practice;
import java.util.Scanner;
public class number_reversal {
    static int num_reversal(int n){
        int answer=0;
        while(n!=0){
            answer=answer*10+(n%10);
            n/=10;
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(num_reversal(number));
    }
}
