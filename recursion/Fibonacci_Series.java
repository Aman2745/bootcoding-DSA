package recursion;
//Fibonacci series with recursion
public class Fibonacci_Series {
    public int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Fibonacci_Series fi=new Fibonacci_Series();
        System.out.println(fi.fib(13));
    }
}
