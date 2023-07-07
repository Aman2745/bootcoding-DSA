package recursion;

public class AscendingOdd {
    public static void ascendingodd(int n){
        if(n<1){
            return;
        }
        ascendingodd(n-1);
        if(n%2!=0){
            System.out.print(n+" ");
        }
    }
}
