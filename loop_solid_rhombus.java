public class loop_solid_rhombus {

    public static void main(String args[]){

        int n = 5;

        //Outer loop
        for(int i=1; i <= n; i++){

            //1st part space
            for(int j=1; j <= (n-i); j++){
                System.out.print(" ");
            }
            //2nd part stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
