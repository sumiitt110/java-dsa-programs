package pw_imp_ques;
import java.util.Scanner;
// to check three points are line on a straight line
public class PointOnLine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x1 and y1:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.print("Enter the value of x2,y2:");
       int x2=sc.nextInt();
        int y2=sc.nextInt();
        System.out.print("Enter the value of x3,y3:");
        int x3=sc.nextInt();
        int y3=sc.nextInt();

        if(((y2-y1)/(x2-x1))==((y3-y1)/(x3-x1))){
            System.out.println("All points are lie in a straight line");
        }
        else{
            System.out.println("Point are not lie on a straight line");
        }
    }
    }
