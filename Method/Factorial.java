import java.util.*;

public class Factorial {
     static void Fact(int n){
        int prod=1;
        if (n<0) {
            System.out.println("Invalid number!");
        }
        else if(n==0){
            System.out.println("Factorial of "+ n +"is: "+ 0);
        }
        else{
            for(int i=n;i>=1;i--){
                prod*=i;
            }
        }
        System.out.println("Factorial of "+ n +" is : "+ prod);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N=sc.nextInt();
        Fact(N);
    }
}
