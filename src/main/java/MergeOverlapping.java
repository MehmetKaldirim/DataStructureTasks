import java.util.*;

public class MergeOverlapping {
    public static void main(String[] args) {
        int[][] interval = {{1,2},{3,5},{4,7},{6,8},{9,10}};


        System.out.println(Arrays.deepToString(mergeIntervals(interval)));
    }

    public static int[][] mergeIntervals(int[][] intervals){
        int[][] sortedIntervals=intervals.clone();
        Arrays.sort(sortedIntervals,(a, b)->Integer.compare(a[0],b[0]));
        List<int[]> mergedIntervals=new ArrayList<>();
        int[] currentInterval=sortedIntervals[0];
        mergedIntervals.add(currentInterval);
        for(int[] nextInterval:sortedIntervals){
            int currentIntervalEnd=currentInterval[1];
            int nextIntervalStart=nextInterval[0];
            int nextIntervalEnd=nextInterval[1];

            if (currentIntervalEnd>=nextIntervalStart){
                currentInterval[1]=Math.max(currentIntervalEnd, nextIntervalEnd);
            } else{
                currentInterval=nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);

    }


    private static int[][] removeOverlapping(Integer[][] input) {
    int[][] newArr = null ;
    List<Integer> a;
    Queue<Integer> q = (Queue<Integer>) new Stack<Integer>();
    int row = input.length;
        for (int i = 0 ; i < row; i++){
            for (int j = 0; j <2 ; j++) {
                if (q.size()== 0) {
                    q.add( input[i][j]);
                } else {
                    if (q.peek() < input[i][j]) {
                        q.add (input[i][j]);
                    } else if (q.peek() >= input[i][j]){
                        continue;
                    } else if (q.peek() < input[i][j] + 1) {

                    }
                }
                }

            }



    return newArr;
    }


}
