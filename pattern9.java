public class pattern9 {
        public static void printPattern(int n){
            for(int i=0; i<n; i++){
                for(int j=0; j<=i; j++){
                    System.out.print(j+1);
                }

                for(int j=0; j< (2*n-2*(i+1));j++){
                    System.out.print(" ");
                }

                for(int j=i; j>=0; j--){
                    System.out.print(j+1);
                }

                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            printPattern(5);
        }
}
