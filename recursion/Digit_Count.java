package recursion;

public class Digit_Count {
//    public static void digit(int n){
//        String s= String.valueOf(n);
//        System.out.println(s.length());
//
//        int remainder=0;
//        int count=0;
//        while(n>0){
////            remainder=n%10;
//            n=n/10;
//            count++;
//        }
//        System.out.println(count);
//    }

    //with the help of recursion
    public static int digi(int num){

        if(num==0){
            return 0 ;
        }
         return 1+digi(num/10);
    }



    public static void main(String[] args) {
        //digit(530);
        System.out.println(digi(43943));;
    }
}
