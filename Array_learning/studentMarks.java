package Array_learning;
import java.util.*;
public class studentMarks {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in a array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the marks of the student: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<35){
                System.out.println("Roll Number: "+ i);
            }
        }
    }
}
