import java.util.*;

public class Max_element{    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array :");
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Maximum element in the given array : " + arr[n-1]);
    }
    
}