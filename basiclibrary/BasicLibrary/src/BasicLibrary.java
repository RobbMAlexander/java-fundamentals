import java.util.Arrays;
import java.util.Random;

public class BasicLibrary {

    public static int[] roll(int n) {
        int rollCount = 0;
        int[] diceRollsArr = new int[n];
        while (rollCount < n) {
            Random d6 = new Random();
            int d6Result = d6.nextInt(6-1) +1;
            diceRollsArr[rollCount] = d6Result;
            rollCount++;
            }
        return diceRollsArr;
    }

    public static boolean containsDuplicates(int [] arr) {
        boolean containsDuplicate = false;
        int valueCount = 0;
        dupeCheckLoop: for (int i = 0; i < arr.length; i++) {
            for (int element : arr) {
                if (element == arr[i]) {
                    valueCount++;
                }
            }
            if (valueCount > 1) {
                containsDuplicate = true;
                break dupeCheckLoop;
            }    else {
                valueCount = 0;
            }
        }
        return containsDuplicate;
    }

    public static float arrayAverage(int [] arr) {
        int arraySum = 0;
        for (int value:
             arr) {
            arraySum += value;
        }
        return ((float)arraySum)/arr.length;
    }

    public static int [] findLowestMeanArr(int[][] arrOfArrs) {
        float[] arrOfAverages = new float[arrOfArrs.length];
        for (int i = 0; i < arrOfArrs.length; i++) {
            arrOfAverages[i] = arrayAverage(arrOfArrs[i]);
        }
        int lowestAverageArrIdx = 0;
        float lowestAverage = arrOfAverages[0];
        for (int i = 1; i < arrOfArrs.length; i++) {
            if (arrOfAverages[i] < lowestAverage) {
                lowestAverage = arrOfAverages[i];
                lowestAverageArrIdx = i;
            }
        }
        return arrOfArrs[lowestAverageArrIdx];
    }

    public static void main(String[] args) {
        int [] testDupesArrTrue = {0,1,2,2};
        int [] testDupesArrFalse = {0,1,2,3};
        System.out.println(containsDuplicates(testDupesArrTrue));
        System.out.println(containsDuplicates(testDupesArrFalse));
        System.out.println(Arrays.toString(roll(5)));
        System.out.println(Arrays.toString(roll(10)));
        int [] averageTestArrOne = {0,1,2,3,4,5};
        int [] averageTestArrTwo = {50, 100, 150};
        System.out.println(arrayAverage(averageTestArrOne));
        System.out.println(arrayAverage(averageTestArrTwo));
        int [][] testLowestMeanArrOne = {
                {1,1,1},
                {2,2,2},
                {3,3,3},
        };
        int [][] testLowestMeanArrTwo = {
                {10,10},
                {7,7},
                {11,11},
                {0,0},
        };

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(Arrays.toString(findLowestMeanArr(testLowestMeanArrOne)));
        System.out.println(Arrays.toString(findLowestMeanArr(testLowestMeanArrTwo)));
        System.out.println(Arrays.toString(findLowestMeanArr(weeklyMonthTemperatures)));
    }
}