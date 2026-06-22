import java.util.*;

public class DoubleFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();
        System.out.println();
    for(int i=1;i<=r;i++){
        for(int j=1;j<i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=r-i+1;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }  
    }

