package leetcode_questions;

import java.util.HashMap;

public class Sumation {
    public static int sum(int n[]){
        HashMap<Integer,Integer>arr=new HashMap<>();
        int Sm=0;
        for (int val : n ) {

            Sm=+arr.get(val);
        }

        return Sm;
    }

    public static void main(String[] args) {
        int n[]={1,2,2,3};
        System.out.println(sum(n));;
    }
}
