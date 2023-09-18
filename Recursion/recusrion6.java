package Recursion;

public class recusrion6 {
    // static boolean pali(String str , int start,int end){
    //     while (start < end) {
    //      if(str.charAt(start) == str.charAt(end)){
    //         return pali(str,start+1,end-1);
    //      }else{
    //         return false;
    //      }
    //     }

    //     return true;
    // }

    static boolean pali(String str,int i,int n){
        if(i >= n/2)
            return true;
        
        
     if(str.charAt(i) != str.charAt(n-i-1))
            return false;
        
        
    return pali(str,i+1,n);
    }

    public static void main(String[] args) {
        String str = "ABCDCMA";
        int n = str.length();
        boolean sol = pali(str,0,n);
        System.out.println(sol);
    }
}

