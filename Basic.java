import java.util.ArrayList;
import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        Basic basic = new Basic();
        // basic.print1to255();
        // basic.printOdd1to255();
        // basic.printsum();
        int[] nums = {1,2,-13,4,5,0,16};
        // basic.printEach(nums);
        // basic.findMax(nums);
        // basic.getAverage(nums);
        // basic.arrayWithOddNumbers();
        // basic.greaterThanY(nums, 7);
        // basic.squareTheValues(nums);
        // basic.eliminateNegatives(nums);
        // System.out.println(basic.getMaxMinAvg(nums));
        System.out.println(Arrays.toString(basic.shiftValues(nums)));
    }
    public void print1to255() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }
    public void printOdd1to255() {
        for (int i = 1; i < 256; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public void printsum() {
        int sum = 0;
        for (int i = 1; i < 256; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }
    public void printEach(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }
    public void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public void getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = sum / arr.length;
        String average = String.format("%f", avg);

        System.out.println(average);
    }
    public void arrayWithOddNumbers() {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                odds.add(i);
            }
        }
        System.out.println(odds);
    }
    public void greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                count += 1;
            }
        }
        System.out.println(count);
    }
    public void squareTheValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public void eliminateNegatives(int[] arr) {
        for (int i=0; i<arr.length; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public ArrayList<Object> getMaxMinAvg(int[] arr){
        int max = arr[0];
        int min = arr[0];
        double sum = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];                
            }
            if (arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        ArrayList<Object> y = new ArrayList<Object>();
        y.add(max);
        y.add(min);
        y.add(sum/arr.length);
        return y;
    }
    public int[] shiftValues(int[] arr){
        for (int i=0; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
        // public static void dojoNegatives(Object[] arr){
    //     for (int i=0; i<arr.length; i++){
    //         if (arr[i] instanceof Integer){
    //             if ((int) arr[i] < 0){
    //                 arr[i] = "Dojo";
    //             }
    //         }
    //     }
    //     System.out.println(arr);
    // }

}