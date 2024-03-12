import java.util.*;

public class Sorting{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array:");
     int n = sc.nextInt();
     System.out.println("Enter the elements of array :");
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }
     System.out.println("Enter a number to find its occurance in the array:");
     int o = sc.nextInt();
     Arrays.sort(arr);
     System.out.println("Sorted Array :");
     for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
     }
     System.out.println();
     int cnt = 0;
     for(int i=0;i<n;i++){
        if(arr[i] > o){
             break;
        }
        if(arr[i] == o){
             cnt += 1;
        }
      }
      System.out.println("Number of occurences of the given element :" + cnt);
    }
}