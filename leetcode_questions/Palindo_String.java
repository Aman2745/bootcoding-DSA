package leetcode_questions;

public class Palindo_String {
    public static boolean ispalindrome(String s){

        s=s.toLowerCase();
        if(s.length()==0||s==null){
            return true;
        }

        for(int i=0;i<s.length()/2;i++){
            char start=s.charAt(i);
            char end=s.charAt(s.length()-1-i);//from last point it is decrementing
            if(start!=end){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(ispalindrome(str));
    }
}
