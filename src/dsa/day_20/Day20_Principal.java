package src.dsa.day_20;

import java.util.Arrays;
import java.util.Scanner;

public class Day20_Principal {
    public static void main(String[] args) {
        String textProblem = """
                Day 20: Find Lucky Integer in an Array
                Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
                Return the largest lucky integer in the array. If there is no lucky integer return -1.""";
        System.out.println(textProblem);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Input: arr = " + Arrays.toString(arr));
        System.out.println("Output: " + findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        Arrays.sort(arr);
        int i,li=-1,c=1;

        for (i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                c++;
            }else{
                if (c == arr[i-1]){
                    if(arr[i-1]>li){
                        li=arr[i-1];
                    }
                }
                c=1;
            }
        }
        if(c==arr[arr.length-1]){
            if (arr[arr.length-1]>li){
                li=arr[arr.length-1];
            }
        }
        return li;
    }
}
