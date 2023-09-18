package Recursion;

public class recursion5 {
    static void reverse(int[] arr,int start, int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reverse(arr,start+1,end-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n= arr.length;
        reverse(arr,0,n-1);

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
