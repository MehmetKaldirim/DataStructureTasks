import java.util.Arrays;

public class SometimesSheetHappens {
    public static void main(String[] args) {
        int  nums[] = {1,2,3,4,5};

        twoPartProduct(nums);

    }

    private static int[] twoPartProduct(int[] nums) {
        int [] newArr = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        left[0]=1;
        right[nums.length-1]= 1;
        for (int i = 1, j =nums.length-1; i < nums.length; i++,j--) {

            left[i] = nums[i] + left[i-1];
            System.out.println("left=" + left  );
            right[j] = nums[j-1] + right[j];

            System.out.println(newArr[i] = left[i]* right[i]);
        }
      return newArr;
    }
}
