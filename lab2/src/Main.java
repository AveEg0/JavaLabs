import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] array = {2,1,3,-4,5,1,2,6,-7,0,1,-3,4};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        while (number >= array.length) {
            System.out.println("Enter the number of elements of the array to be moved to the end");
            number = scanner.nextInt();
            if (number >= array.length || number < 0)
                System.out.println("Incorrect input: array length = " + array.length);
        }
        System.out.println("Initial array:\n" + Arrays.toString(array));
        System.out.println("Sum of the elements with odd index = " + sumOfElementsWithOddIndex(array));
        System.out.println("Sum of the elements between first and second negative numbers = " +
                sumOfElementsBetweenFirstAndSecondNegativeNumbers(array));
        System.out.println("Moving X elements to the end of the array");
        int[] newArray = moveElementsToEndArray(array,number);
        System.out.println("New Array:\n" + Arrays.toString(newArray));
        long usedBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("\n used bytes = " + usedBytes);
    }

    private static int sumOfElementsWithOddIndex (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) sum += array[i];
        }
        return sum;
    }

    private static int sumOfElementsBetweenFirstAndSecondNegativeNumbers(int[] array) {
        int sum = 0;
        int count = 0;
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && count == 0) {
                index1 = i;
                count++;
            } else if (array[i] < 0 && count == 1) {
                index2 = i;
                count++;
            }
            if (count == 2) break;
        }
        if (count < 2) return sum;
        for (int i = index1 + 1; i < index2; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int[] moveElementsToEndArray (int[] array, int number) {
        int[] newArray =  new int[array.length];
        for (int i = number, j = 0; i < array.length; i++, j++) {
            newArray[j] = array[i];
        }
        for (int i = array.length - number, j = 0; i < array.length; i++, j++) {
            newArray[i] = array[j];
        }
                return newArray;
    }
}
