package Chapter2._2_Arrays;

public class ArrayBasics {

    public int getLengthOfArray(int[] arr){
        return arr.length;
    }
    public int getNthElementOfArray(int[] arr, int n){
        return arr[n];
    }
    public int[] setNthElementOfArray(int[] arr, int n, int val){
//        change nth element to val before this return
        arr[n] = val;
        return arr;
    }
//    create a new array. no need to worry about the values within the array.
    public int[] returnNewArraySizeN(int n){
        int[] intArray = new int[n];
        return intArray;
    }
}
