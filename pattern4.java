 class pattern4 {
    public static void main(String[] args) {
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
