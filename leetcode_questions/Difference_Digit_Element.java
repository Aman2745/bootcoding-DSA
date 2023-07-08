package leetcode_questions;
//LEETCODE QUESTION 2535
public class Difference_Digit_Element {
    public static int differenceOfSum(int[] nums) {
        int sum=0;
        int digit_sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(nums[i]>0){
                int remainder=nums[i]%10;
                digit_sum=digit_sum+remainder;
                nums[i]=nums[i]/10;
            }
        }
        return Math.abs(digit_sum-sum);
    }

    public static void main(String[] args) {
        int arr[]={1,15,6,3};

        System.out.println(differenceOfSum(arr));;

    }
}
