import java.util.Scanner;
import java.util.Arrays;

public class MissingArray {
    public static int Summ(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in an array:");
    int n=sc.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter the number of an array:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
 int N= arr.length +1;
 int result1=Summ(arr);
  int result2=N*(N+1)/2;
  System.out.println(result2-result1);
}
}