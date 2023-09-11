import java.util.Arrays;

public class aula24 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int[] nums2 = new int[]{1, 2, 3};

        System.out.println(nums == nums2);
        System.out.println(nums.equals(nums2));

        System.out.println(nums + " " + nums2);

        System.out.println(Arrays.equals(nums, nums2));
    }
}
