import java.util.Scanner;

public class checkchar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        // check Character is vowel or not
        if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u") || str.equals("A") || str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")){
            System.out.println(str +" is a vowel");
        }
        else{
            System.out.println(str +" is a consonant");
        }
    }
}