package array;
import java.util.*;
public class decimal_to_binary {

public static void print(int arr[], int  n ){
        int i = 0;
        while(n>0){
            arr[i++] = n%2;
            n= n/2;
        }
        System.out.println("Binary is");
    System.out.println();
        for(int j = i-1; j>=0; j--) {
            System.out.print(arr[j]);
        }
    System.out.println();
        }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your decimal Number");

        int n = sc.nextInt();
        int  j = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int [100] ;
        print(arr,n);
        print(arr,k);
        print(arr,j);

    }
}
