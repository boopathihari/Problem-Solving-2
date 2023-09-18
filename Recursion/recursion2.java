package Recursion;

public class recursion2 {
    static void sum(int i ,int n, int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        
        System.out.println(sum);
        sum(i-1,n,sum+i);
    }


    public static void main(String[] args) {
        int n=5,sum=0;
        sum(n,n,sum);
        // System.out.println(sum);
    }
}
