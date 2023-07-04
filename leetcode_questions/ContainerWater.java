package leetcode_questions;

public class ContainerWater {
    public int maxArea(int[] height) {
        int maxwater = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int ht = Math.min(height[i], height[j]);
                int widht = j - i;
                int currentwater = ht * widht;
                maxwater = Math.max(currentwater, maxwater);
            }

        }
        return maxwater;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        ContainerWater containerWater = new ContainerWater();
        System.out.println(containerWater.maxArea(arr));;
    }
}
