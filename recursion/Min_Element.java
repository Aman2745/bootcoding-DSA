package recursion;

public class Min_Element {
    public static  int min(int arr[],int mimn ,int i){
        if(i==arr.length){
            return mimn;
        }
        if(mimn>arr[i]){
            mimn=arr[i];
        }
        return min(arr,mimn,++i);
    }

    public static void main(String[] args) {
        int arr[]={3,2,8,0};
        System.out.println(min(arr,100,0));;
    }
}
