package Lab3BatagdahDasgal;
import java.util.Random;
import java.util.Arrays;

public class RandomRemove {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 33, 42, 59, 68, 71};
        System.out.println("Анхны массив: " + Arrays.toString(numbers));

        numbers = removeRandomElement(numbers);
        System.out.println("Устгасны дараах массив: " + Arrays.toString(numbers));
    }

    public static int[] removeRandomElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; 
        }

        Random rand = new Random();
        int indexToRemove = rand.nextInt(arr.length); 
        System.out.println("Сонгогдсон индекс: " + indexToRemove + " (Утга: " + arr[indexToRemove] + ")");

        int[] newArr = new int[arr.length - 1];
        
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == indexToRemove) {
                continue; 
            }
            newArr[j++] = arr[i]; 
        }
        
        return newArr;
    }
}
