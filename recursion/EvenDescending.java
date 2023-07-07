package recursion;

public class EvenDescending {
    public  static void descendingprint(int n){
        if(n<1){
            return;
        }
        if(n%2==0){
            System.out.print(n+" ");
        }
        descendingprint(n-1);
    }
}
