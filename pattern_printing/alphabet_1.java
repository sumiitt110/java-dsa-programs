package pattern_printing;
import java.util.Scanner;

public class alphabet_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        //Logic to print pattern 

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print((char)(j+96)+ " ");
            }
            System.out.println();
        }
    }
}
