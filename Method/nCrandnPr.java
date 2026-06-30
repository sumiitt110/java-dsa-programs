import java.util.*;

public class nCrandnPr {
   
    public static int factorial(int n){
         int F=1;
        for(int i=n;i>0;i--){
            F=F*i;
        }
        return F;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the valuse of n and r :");
        int n=sc.nextInt();
        int r=sc.nextInt();

        float nCr=factorial(n)/(factorial(r)*factorial(n-r));
        float nPr=factorial(n)/(factorial(n-r));
        System.out.println(n +"C"+r+ ":" + nCr);
        System.out.println(n +"P"+r+ ":" + nPr);
    }
}
