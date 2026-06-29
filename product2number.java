import java.util.*;

public class product2number {
    public static int multi(int x , int y){
        int product=x*y;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number :");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int res=multi(a, b);
        System.out.println("product="+ res);
    }
}
