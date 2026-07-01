import java.util.*;

public class TwoSum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in an array:");
    int n=sc.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter the number of an array:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target sum :");
    int target=sc.nextInt();
    int found=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                System.out.println("Element found at index :" + i + " "+j);
                found=1;
            }
        }
    }
    if(found==0)
        System.out.println("Target sum not found !");
  }  
}
