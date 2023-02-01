
/*Пусть дан произвольный список целых чисел, удалить из него четные числа */

public class lesson3_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 7, 7, 8, 11, 4, 6};
        printArray("Целый массив:", array);
 
        array = deleteEvenNumbers(array);
        printArray("Массив нечетных чисел", array);
 
    }
 
    public static void printArray(String text, int[] array) {
        System.out.print(text + " [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
 
    public static int[] deleteEvenNumbers(int[] array) {
        int[] result = new int[array.length / 2];
        int i, j;
        for (i = 0, j = 1; j < array.length; i++, j += 2) {
            result[i] = array[j];
        }
        return result;
    }
}
