package main.JAVA.continuebreak;

public class App {
    public static void main(String[] args) {
         int[] nums = {1, 5, 7, 9, 8, 11, 3};
        for (int i = 0; i<nums.length; i++) {
            if(nums[i] == 8) {
                continue;
            }
            System.out.println(nums[i]);
        }
        System.out.println("+++++");

        for (int i = 0; i<nums.length; i++) {
            if(nums[i] == 8) {
                break;
            }
            System.out.println(nums[i]);
        }
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);

        }
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7 || i == 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}
