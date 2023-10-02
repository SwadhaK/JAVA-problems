public class loop_butterfly_pattern {
    public static void main(String args[]){

        int n = 4;
        //outer loop - first half
        for(int i=1; i<=n; i++){

            //inner loop - number left
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //inner loop - space middle
            for(int j=1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            //inner loop - number right
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //outer loop - second half
        for(int i=n; i>=1; i--){

            //inner loop - number left
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //inner loop - space middle
            for(int j=1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            //inner loop - number right
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
    
}
