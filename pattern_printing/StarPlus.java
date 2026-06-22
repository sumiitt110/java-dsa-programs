import java.util.*;

public class StarPlus {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows(number should be always be odd):");
    int r=sc.nextInt();
System.out.println();

    for(int i=1;i<=r;i++){
        for(int j=1;j<=r;j++){
            if(i==(r/2)+1 || j==(r/2)+1)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }
 }   
}
