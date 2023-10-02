public class loop_number_full_pyramid {
    public static void main(String args[]){

        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //part space
            for(int j=1; j<=(n-i); j++ ){
                System.out.print(" ");
            }
            //part number print
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        // PALINDROMIC PATTERN
        //outerloop
        for(int i=1; i<=n; i++){
            //part space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //part number left
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            
            //part number right
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }

    }
    
}
