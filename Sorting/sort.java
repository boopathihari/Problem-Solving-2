package Sorting;

public class sort {
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // public static void selection(int[] arr, int n){

    //     for(int i=0; i<=n-2; i++){
    //         int min = i;

    //         for(int j=i+1; j<=n-1; j++){
    //             if(arr[j] < arr[min]){
    //                 min = j;
    //             }
    //         }
    //         swap(arr,i,min);
    //     }

    //     for(int i=0;i<n; i++){
    //         System.out.println(arr[i]);
    //     }
    // }


    public static void bubble(int[] arr, int n){
        for(int i=n-1; i>0; i--){
            int flag=0;
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    flag=1;
                }
            }

            if(flag == 0){
                    break;
            }
        }

         for(int i=0;i<n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void insertion(int[] arr, int n){

        for(int i=0; i<n; i++){
            int j=i;
            while (j>0 && (arr[j-1] > arr[j])) {
                swap(arr,j-1,j);
                j--;
            }
        }

            for(int i=0;i<n; i++){
                System.out.println(arr[i]);
            }
    }

    public static void main(String[] args) {
        int[] arr = {9,4,3,2,1,5};
        

        // selection(arr,arr.length);    
        bubble(arr,arr.length);
        // insertion(arr,arr.length);
    }
}
