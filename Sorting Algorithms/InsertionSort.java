public class InsertionSort {
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,5,67,15,3,20};
        System.out.println("Before Sorting:");
        print(arr);
        sort(arr);
        System.out.println("After Sorting ");
        print(arr);
    }
}
