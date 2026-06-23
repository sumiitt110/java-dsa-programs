import java.util.*;

public class Diamond {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int r=sc.nextInt();
    System.out.println();

    //upper half--
    for(int i=1;i<=r;i++){
        for(int j=1;j<=r-i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    //lowe half--

    for(int i=r-1;i>0;i--){
        for(int j=r;j>i;j--){
            System.out.print("  ");
        }

        for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
        }
        System.out.println();
    }
   } 
}

