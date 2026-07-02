import java.util.*;

public class RotateArray {
public static void reverse(int[] brr , int l, int h){
    while(l<h){
        int temp=brr[l];
        brr[l]=brr[h];
        brr[h]=temp;
        l++;
        h--;
    }
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
    System.out.println("Enter the value from the array rotate:");
    int d=sc.nextInt();
   reverse(arr,0,(arr.length-1));
   reverse(arr,0,d-1);
   reverse(arr,d,(arr.length-1));
for(int e : arr) System.out.print(e+" ");
}
}
