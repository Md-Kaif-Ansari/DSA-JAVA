public class MergeSort {
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l +1;
        int n2 = r-mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0; i<n1; i++){
            arr1[i] =arr[l+i];
        }
        for(int j=0; j<n2; j++){
            arr2[j] =arr[mid+1+j];
        }
        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
            } else{
                arr[k] = arr2[j];
                j++;
            }
            k++;

        }
        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }

    static void mSort(int[] arr,int l, int r){
        if(l<r){
            int mid = l + (r - l)/2;
            mSort(arr, l ,mid);
            mSort(arr, mid+1, r);
            merge(arr, l , mid, r);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,3,0,8,5};
        int n = arr.length;
        System.out.println("Before Sorting:");
        print(arr);
        mSort(arr,0,n-1);
        System.out.println("After Sorting ");
        print(arr);

    }
}
