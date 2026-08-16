import java.util.Scanner;
public class number_analyser {

    static int readNumber(Scanner input){
        int number = input.nextInt();
        return number;
    }
    static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean isPositive(int number){
        if(number>0){
            return true;
        }
        else{
            return false;
        }
    }
    static int absoluteValue(int number){
        if(number<0){
            return -number;
        }
        else{
            return number;
        }
    }
    static int countDigits(int number){
        int count =0;
        if(number==0){
            return 1;
        }
        else {
            while (number != 0) {
                if(number<0){
                    number=-number;
                }
                number = number / 10;
                count++;
            }
        }
        return count;
    }
    static int sumDigits(int number){
        int sum =0;
        while(number!=0){
            if(number<0){
                number=-number;
            }
            int digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        return sum;
    }
    static void printReport(int number){
        System.out.println("number ="+number);
        System.out.println("the number is even ="+isEven(number));
        System.out.println("the number is positive ="+isPositive(number));
        System.out.println("the absolute value ="+absoluteValue(number));
        System.out.println("total digits in the number ="+countDigits(number));
        System.out.println("the sum of the digits is ="+sumDigits(number));
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        printReport(number);
    }
}
