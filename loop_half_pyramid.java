public class loop_half_pyramid {
    public static void main(String args[]){

        int n=4;

        //outer loop - row
        for(int i=1; i<=n; i++){
            //inner loop - col
            for(int j=1; j<=i; j++){           //printing stars that is equal to row number that is i
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop - space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop - stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
