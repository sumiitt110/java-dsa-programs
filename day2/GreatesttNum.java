import java.util.Scanner;

class GreatesttNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int n1=sc.nextInt();
        System.out.print("Enter the second number:");
        int n2=sc.nextInt();
        System.out.print("Enter the third number:");
        int n3=sc.nextInt();

        if(n1>n2){
            if(n1>n3){
                System.out.println(n1 + " is greatest number");
            }
            else{
                System.out.println(n3 + " is greatest number");
            }
        }
        else{
            if(n2>n3){
                System.out.println(n2 + " is greatest number");
            }
            else{
                System.out.println(n3 + " is greatest number");
            }
        }
    }
}
