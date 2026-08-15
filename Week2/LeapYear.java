import java.util.Scanner;
public class leap_year {
    static boolean isLeapYear(int year){
        if(year%4==0 && year%100 !=0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main() {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println(isLeapYear(year));
    }
}
