import java.util.*;
public class FactorialOfNumber {
    
    public static void Factorial(int n){
        if(n<0){
            System.out.println("INVALID N");
            return;
        }
        int fac=1;
        for(int i=n; i>=1; i--){
            fac=fac*i;
        }
        System.out.println(fac);
        return;
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial(n);

    }
}
