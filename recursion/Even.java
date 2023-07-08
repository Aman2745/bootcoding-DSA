package recursion;

public class Even {
    public static void ascendingevenprint(int n){
        if(n<1){
            return ;
        }
        ascendingevenprint(n-1);
        if(n%2==0){
            System.out.print(n+" ");;
        }
    }
    public static void main(String[] args) {

        Even.ascendingevenprint(10);
        System.out.println();
        AscendingOdd.ascendingodd(10);
        System.out.println();
        EvenDescending.descendingprint(10);
        System.out.println();
        System.out.println(SumToN.sum(10));

    }
}
