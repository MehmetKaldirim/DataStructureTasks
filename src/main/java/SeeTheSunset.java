import java.util.*;

public class SeeTheSunset {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 47, 4, 3, 1, 3, 2};
        sunsetViews(buildings, "WEST").forEach(System.out::println);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> candidateBuildings = new Stack<>(); // O(n) space complexity
        int index = 0;
        int step = 1;
        if(direction.equals("WEST")){
            index = buildings.length-1;
            step = -1;
        }

        while(index >= 0 && index < buildings.length){
            while(!candidateBuildings.isEmpty() && buildings[candidateBuildings.peek()] <= buildings[index]){
                candidateBuildings.pop();
            }
            candidateBuildings.push(index);
            index += step;
        }
        if (direction.equals("WEST")) Collections.reverse(candidateBuildings); //O(n)
        return new ArrayList<Integer>(candidateBuildings); // O(2n)= O(n) time complexity
    }
}