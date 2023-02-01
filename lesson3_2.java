/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. */

public class lesson3_2 {
    public static void main(String args[]){
        int ArrayList[] = new int[] {1, 101, 45, 6, 17, 92};
     
        int max = maxNum(ArrayList);
        System.out.println("Максимальное число = "+max);
     
        int min = minNum(ArrayList);
        System.out.println("Минимальное число = "+min);
      }
     
      public static int maxNum(int[] Array){ 
        int maxN = Array[0]; 
        for(int i=1; i < Array.length; i++){ if(Array[i] > maxN){ 
             maxN = Array[i]; 
          } 
        } 
        return maxN; 
      }
     
      public static int minNum(int[] Array){ 
        int minN = Array[0]; 
        for(int i=1; i<Array.length; i++){ 
          if(Array[i] < minN){ 
            minN = Array[i]; 
          } 
        } 
        return minN; 
      } 
}