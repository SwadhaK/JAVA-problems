public class loop_hollow_rectangle {
    public static void main(String args[]){
        int l=5;
        int w=4;
        
        //outer loop - rows
        for(int i=1; i<=w; i++){
            //inner loop - col
            for(int j=1; j<=l; j++ ){
                //we are at cell - (i,j)
                if(i==1 || j==1 || i==w || j==l){     //print stars the boundary where coordinates are (1,1),(n,m),(1,m),(n,1)
                    System.out.print("*");   
                }else{
                    System.out.print(" ");          //fr the space b/w stars 
                }

            }
            System.out.println();
        }
    }
    
}
