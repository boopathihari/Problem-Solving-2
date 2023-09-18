public class pattern8 {
        public static void printPattern(int n){
            for(int i=n; i>0; i--){
              
                for(int j=0; j<n-i; j++){
                    System.out.print(" ");
                }
                
                for(int j=0; j<(2*i-1); j++){
                    System.out.print("*");
                }
               
                
                for(int k=0; k<n-i; k++){
                    System.out.print(" ");
                }

                System.out.println();
            }
        }
    
        public static void main(String[] args) {
    
    
            printPattern(5);
              
        }
}
