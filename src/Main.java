/*
Question : Print the maximum value of array.
 */

import java.util.Scanner;

public class Main {
    static int PrintMaximum(int[] array, int index){
        if (index == array.length - 1){
            return array[index];
        }
        int smallAns = PrintMaximum(array,index + 1);
        return Math.max(smallAns,array[index]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialize,ArraySize,temp = 1,index = 0;
        System.out.println("Enter the length of array :");
        ArraySize = sc.nextInt();
        int[] Array = new int[ArraySize];
        System.out.println("Enter the element of array :");
        for (initialize = 0; initialize < Array.length; initialize++){
            Array[initialize] = sc.nextInt();
        }
        System.out.println("Printing the result without using recursion :");
        for (initialize = 0; initialize < Array.length; initialize++){
            if (Array[initialize] >= temp){
                temp = Array[initialize];
            }
        }
        System.out.println(temp);
        System.out.println("By using recursion printing the result :");
        System.out.println(PrintMaximum(Array,index));
    }
}