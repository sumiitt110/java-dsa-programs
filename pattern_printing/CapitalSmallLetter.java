package pattern_printing;
import java.util.Scanner;

public class CapitalSmallLetter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i%2==0)
                System.out.print((char)(i+64)+" ");
                else{
                    System.out.print((char)(i+96)+" ");
                }
            }
            System.out.println();
        }
    }
}
