
import java.util.Scanner;

public class NumberTriangle{
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int r=sc.nextInt();
System.out.println();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
