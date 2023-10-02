public class loop_number_pyramid {
    public static void main(String args[]){

        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //inverted half pyramid with numbers
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //floyd's triangle
        int number=1;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }

        //0-1 triangle
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){

                if((i+j)%2 == 0){                  //even
                    System.out.print("1"+ " ");
                }else{                             //odd
                    System.out.print("0"+ " ");
                }
            }
            System.out.println();
        }

    }
}
