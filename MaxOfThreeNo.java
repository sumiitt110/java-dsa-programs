import java.util.*;

public class MaxOfThreeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Max of 3 number is "+ Math.max(Math.max(a, b),c));
    }
}
