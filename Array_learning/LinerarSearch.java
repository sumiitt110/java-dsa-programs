import java.util.*;
public class LinerarSearch {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      } 
      boolean flag=false;
       int key;
      System.out.println("Enter the key to search: ");
        key=sc.nextInt();;
       for(int i=0;i<n;i++){
        if(arr[i]==key){
            System.out.println("element find in index "+ i);
            flag=true;
            break;
        }
        else{
            flag=false;
      }
    }
    if(flag==false){
        System.out.println("Elements not find !");
      } 
}
}
