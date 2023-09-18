package Recursion;

public class recursion1 {
    
    static void printName(int i, int n){
        if(i > n)
            return;
        
        System.out.println("Boopathi Hari");
        printName(i+1, n);
    }

    public static void main(String[] args) {
        int n=4;
        printName(1,n);
    }
}
