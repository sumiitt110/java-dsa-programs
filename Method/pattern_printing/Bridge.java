import java.util.*;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();
        System.out.println();

        for(int i=1;i<=2*r-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<=r-1;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=r-i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
