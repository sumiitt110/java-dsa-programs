
import java.util.Scanner;

public class rectangle_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        //logic to print pattern---

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
