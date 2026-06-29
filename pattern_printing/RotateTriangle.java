import java.util.*;

public class RotateTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();

        //outer loop to iterate rows--

        for(int i=1;i<=r;i++){

            //inner loop to print space--

            for(int j=1;j<=r-i;j++){
                System.out.print("  ");
            }
                //inner loop to print * star--

                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
           
        }
    }
