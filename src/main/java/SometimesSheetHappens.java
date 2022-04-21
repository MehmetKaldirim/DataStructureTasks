import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SometimesSheetHappens {
    public static void main(String[] args) {
        int  nums[] = {1,2,3,4,5};

        show(nums);
        mitPow(nums);


    }

    private static void mitPow(int[] nums) {
        int left = 1;
        int right = 1;

        int[] l = new int[nums.length];
        int[] r = new int[nums.length];


        for (int i = 1, j = nums.length; i < nums.length ; i++, j--) {
            left = left * (int) Math.pow(nums[i],0);
            l[i] = left * nums[i-1];

        }
        System.out.println(Arrays.toString(l));
    }


    private static void show(int[] nums) {

        Map<Integer, int[][]> arrsMap = new HashMap<Integer,int [][]>();

        for (int i = 1; i <= nums.length ; i++) {
            int[] left = Arrays.copyOfRange(nums,0,i-1);
            int[] right = Arrays.copyOfRange(nums,i,nums.length );
            int[][] a = {left,right};
            arrsMap.put(i,a);

        }
            arrsMap.forEach((key,value) -> System.out.println(key + " : " + Arrays.deepToString(value)));
    }


}
