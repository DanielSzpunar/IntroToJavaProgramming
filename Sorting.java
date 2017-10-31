import java.util.Arrays;

public class Sorting {
  public static void main(String[] args) {
	    int[] list = {101,3,5,7,9,2,4,6,8,10,12,44,34,2};
	    int smallestValue = smallestValue(list);
        System.out.println("Smallest Value: " + smallestValue);
        System.out.println("--------------");
        int smallestValueIndex = smallestValueIndex(list);
        System.out.println("Smallest Value Index: " + smallestValueIndex);

        System.out.println("-------------");
        int smallestIndexFrom =  smallestIndexFrom(list, 6);
        System.out.println("Smallest Index From is : " + smallestIndexFrom);
        System.out.println("----------------");
        System.out.println("Before Swap: " + Arrays.toString(list));
        swap(list, 2,5);
        System.out.println("After Swap: " + Arrays.toString(list));
        System.out.println("---------------");
        sort(list);



    }
    public static int smallestValue(int[] array) {
        int smallestValue = array[0];
        for(int i = 0; i < array.length; i++) {
            if (smallestValue > array[i]) {
                smallestValue = array[i];
            }
        }
        return smallestValue;
    }
    public static int smallestValueIndex(int[] array) {
        int smallestValueIndex = 0;
        for (int i = 0; i < array.length; i ++) {
            if(array[smallestValueIndex] > array[i]) {
                smallestValueIndex = i;
            }
        }
        return smallestValueIndex;
    }
    public static int smallestIndexFrom(int[] array, int index) {
        int smallestIndexFrom = index;
        for (int i = index; i < array.length; i++) {
            if (array[smallestIndexFrom] > array[i]) {
                smallestIndexFrom = i;
            }
        }
        return smallestIndexFrom;
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = smallestIndexFrom(array,i);
            swap(array,i,smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
