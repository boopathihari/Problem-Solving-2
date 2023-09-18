public class pattern5 {  
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int k=0; k<(5-i-1) ; k++){
                    System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print("*");    
            }

            for(int o=0; o<i; o++){
                System.out.print("*");
            }
            System.out.println();
        }  
        
        for(int i=5; i>0; i--){
            for(int k=5; k>i ; k--){
                    System.out.print(" ");
            }

            for(int j=i; j>0; j--){
                System.out.print("*");    
            }

            for(int o=0; o<i-1; o++){
                System.out.print("*");
            }
            System.out.println();
        }     
    }
}
