package lib.Data;

import lib.Misc.Randomizer;

import java.util.Arrays;

public class ArrayTool {

    public static int[] arrayOfDuplicateElements(int[] array, int num) {
        int size = countRepeated(array, num);
        int[] j = new int[size];
        int h = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                j[h] = i;
                h++;
            }
        }
        return j;
    }

    public static int[] appendNewElement(int[] array, int indice, int elemento) {
        int[] nuevoArray = new int[array.length + 1];
        for (int i = 0; i < nuevoArray.length; i++) {
            if (i < indice) {
                nuevoArray[i] = array[i];
            } else if (i == indice) {
                nuevoArray[i] = elemento;
            } else if (i > indice) {
                nuevoArray[i] = array[i - 1];
            }
        }
        return nuevoArray;
    }

    public static int countRepeated(int[] array, int num) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                j++;
            }
        }
        return j;
    }

    public static int[] removeFromArray(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++)
            if (i != index) {
                newArray[j] = array[i];
                j++;
            }
        return newArray;
    }

    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j])
                    return false;
        return true;
    }
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
        return array;
    }
    public static int[] bubbleSortIndex(int[] array) {
        int[] indexes = new int[array.length];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i]=i;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ( array[indexes[i]] > array[indexes[j]] ) {
                    int aux = indexes[i];
                    indexes[i] = indexes[j];
                    indexes[j] = aux;
                }
            }
        }
        return indexes;
    }
    public static boolean isSortedDesc(int[] array){
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] < array[j])
                    return false;
        return true;
    }
    public static int[] bubbleSortDesc(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] < array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
        return array;
    }
    public static int[] bubbleSortIndexDesc(int[] array) {
        int[] indexes = new int[array.length];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i]=i;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ( array[indexes[i]] < array[indexes[j]] ) {
                    int aux = indexes[i];
                    indexes[i] = indexes[j];
                    indexes[j] = aux;
                }
            }
        }
        return indexes;
    }


    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int indexOfMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }
    public static double max(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int indexOfMax(double[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int[] reverseArray(int[] array){
        int[] reversed = new int [array.length];
        for (int i = 0, j = array.length-1; i < array.length/2; i++, j--) {
            reversed[i] = array[j];
            reversed[j] = array[i];
        }
        return reversed;
    }
    public static int getRandom(int... numbers){
        return numbers[Randomizer.randomInt(numbers.length-1)];
    }
    public static boolean contains(int[] array, int number){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==number)return true;
        }
        return false;
    }
    public static int[] removeDuplicates(int[] array){
        int count = 0;
        int[] unique = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            if( !(contains(unique, array[i])) ) {
                unique[count] = array[i];
                count++;
            }
        }
        return Arrays.copyOfRange(unique, 0, count);
    }

    public static int linearSearch(int[] array,int number){
        for (int i = 0; i < array.length; i++)
            if(array[i] == number)
                return i;
        return -1;
    }


    public static int binarySearch(int[] array, int number){
        int low = 0;
        int high = array.length-1;
        while( high >= low){
            int mid = (low + high) / 2;
            if(number < array[mid])
                high = mid - 1;
            else if( number == array[mid] )
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
}