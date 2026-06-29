import java.util.Scanner;

class CheckNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        if(num<0){
            System.out.println(num + " is a negative");
        }
        else if(num==0){
            System.out.println(num + " is zero");
        }
        else{
            System.out.println(num + " is positive");
        }
    }
}