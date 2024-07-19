public  class LowestNumber {
    public static int lowestNumber() {

        int[] numberArray = {44, 5, 59, 4, 3, 5, 64, 88, 55, 5, 335, 57, 22, 66, 44, 55, 88, 66, 77, 60, 95, 585, 482, 6, 1};
        //WRITE A METHOD TO GENERATE THE LARGEST NUMBER, DECLARE A VARIABLE TO STORE THE NUMBER AND SET IT AT
        //THE FIRST INDEX WHICH IS POSITION 0
        int lowestNumb = numberArray[0];
        for (int count = 1; count < numberArray.length; ++count) {
            if (numberArray[count] < lowestNumb) {
                lowestNumb = numberArray[count];
            }
        }
        return lowestNumb;
    }

    public static void main(String[] args) {
        System.out.println("The smallest number is " + lowestNumber());
    }
}

