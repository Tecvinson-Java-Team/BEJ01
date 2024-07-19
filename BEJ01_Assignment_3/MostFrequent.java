import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    static  int[]  numberArray= {44,5, 59, 4,3,5,64,88,55,5,335,57,22,66,44,55,88,66,77,60,95,585,482,6,1};
    //WRITE A METHOD TO GENERATE THE LARGEST NUMBER, DECLARE A VARIABLE TO STORE THE NUMBER AND SET IT AT
    //THE FIRST INDEX WHICH IS POSITION 0
    public static int mostFrequent() {
        Map<Integer, Integer> newMap = new HashMap<>();
        for(int number: numberArray) {
            int count = newMap.getOrDefault(number, 0);
            newMap.put(number, count + 1);
        }
        Map.Entry<Integer, Integer> mostRepeated = null;
        for(Map.Entry<Integer, Integer> entries : newMap.entrySet()) {
            if (mostRepeated == null)
                mostRepeated = entries;
            else if (entries.getValue() > mostRepeated.getValue())
                mostRepeated = entries;

        };
        return (mostRepeated != null? mostRepeated.getKey() : 0);



    }
    public static void main(String[] args) {
        int frequent = MostFrequent.mostFrequent();
        System.out.println("The most frequent number is " + frequent);

    }
}
