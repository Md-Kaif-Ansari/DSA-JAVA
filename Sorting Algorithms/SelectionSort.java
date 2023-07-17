public class SelectionSort {
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            if(minIdx!=i){
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,0,7,1,3};
        System.out.println("before Sorting");
        print(arr);
        sort(arr);
        System.out.println("After sorting");
        print(arr);

    }
}
