import java.util.*;
public class WaveArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in an array:");
    int n=sc.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter the number of an array:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i+=2){
        if(i==arr.length-1) break;
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
    for(int e: arr) System.out.print(e+" ");
}
}
