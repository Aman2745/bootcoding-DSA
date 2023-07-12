package leetcode_questions;

public class Occurencen_String {
    public static int str(String hack,String needle){
        if(hack.contains(needle)){
            return hack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        String hack="HappyWithRadhaKrishna";
        String needle="Radha";
        System.out.println( str(hack,needle));;
    }
}
