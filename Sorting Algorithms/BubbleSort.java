import java.util.Scanner;
public class BubbleSort{
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sort(int[] arr){
        int n = arr.length;
        boolean isSorted = true;
        for(int i = 0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
               if(arr[j]>arr[j+1]){
                isSorted = false;
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               }
            }
            System.out.println(isSorted);
            if(isSorted) return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before Sorting:");
        print(arr);
        System.out.println("Array after Sorting:");
        sort(arr);
        print(arr);

    }
}