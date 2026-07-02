import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in an array:");
    int n=sc.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter the number of an array:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int l=0,h=arr.length-1;
    while(l<h){
        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
        l++;
        h--;
    }
    for(int e:arr){
        System.out.print(e+" ");
    }
}
}
