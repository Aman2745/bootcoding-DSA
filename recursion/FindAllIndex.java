package recursion;

import java.util.ArrayList;

public class FindAllIndex {
    static ArrayList<Integer> findindex(int arr[],int target,int index,ArrayList<Integer>list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        return findindex(arr,target,index+1,list);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        System.out.println( findindex(arr,4,0,new ArrayList<>()));;
    }
}
