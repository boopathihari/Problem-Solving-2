package Recursion;

public class recursion3 {

   public static int sum(int n){
        if(n == 0){
            return 0;
        }

        return n + sum(n-1);

    }

    public static void main(String[] args) {
        int n=4;
        int sol = sum(n);
        System.out.println(sol);
    }
}
