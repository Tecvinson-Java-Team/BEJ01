
// CREATE A CLASS TO HOUSE YOUR METHODS AND INITIALIZE THE NUMBER ARRAY
public class GreatestNumber {
    static  int[]  numberArray= {44,5, 59, 4,3,5,64,88,55,5,335,57,22,66,44,55,88,66,77,60,95,585,482,6,1};
    //WRITE A METHOD TO GENERATE THE LARGEST NUMBER, DECLARE A VARIABLE TO STORE THE NUMBER AND SET IT AT
    //THE FIRST INDEX WHICH IS POSITION 0
    public static int greatestNumber() {
        int greatestNumb = numberArray[0];
        //LOOP THROUGH THE ARRAY, SET THE COUNTER TO ONE
        for (int counter = 1; counter < numberArray.length; ++counter) {
            // USE IF STATEMENT TO CHECK IF THE VALUE OF THE COUNTER IS GREATER THAN THE INITIAL VALUE OF THE GREATERNUMB VARIABLE
            if (numberArray[counter] > greatestNumb) {            //ANY OF THE COUNTER VALUE THAT IS BIGGER IS THE GREATEST NUMBER
                greatestNumb = numberArray[counter];
            }
        }
        //RETURN THE VALUE OF THE LARGEST NUMBER TO THE MAIN METHOD
        return greatestNumb;
    }
    public static void main(String[] args) {
        System.out.println("The highest number is " + greatestNumber());

    }
}
