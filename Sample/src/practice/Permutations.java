package practice;
import java.util.Arrays;

public class Permutations {

    public static void main(String[] args) {
        int[] array = {1, 2, 3}; // Replace this array with your elements
        generatePermutations(array, 0);
    }

    public static void generatePermutations(int[] array, int currentIndex) {
        if (currentIndex == array.length - 1) {
            System.out.println(Arrays.toString(array));
            return;
        }

        for (int i = currentIndex; i < array.length; i++) {
            swap(array, currentIndex, i);
            generatePermutations(array, currentIndex + 1);
            swap(array, currentIndex, i); // Backtrack to restore the original array
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}