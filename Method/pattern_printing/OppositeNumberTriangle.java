import java.util.*;

public class OppositeNumberTriangle {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int r=sc.nextInt();
    System.out.println();
    //logic--

    for(int i=0;i<r;i++){
        for(int j=1;j<=r-i;j++){
            System.out.print( j+" ");
        }System.out.println();
    } 
}
}