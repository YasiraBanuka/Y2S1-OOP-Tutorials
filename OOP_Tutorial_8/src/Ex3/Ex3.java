package Ex3;

import java.util.Scanner;

public class Ex3 {

    public static Integer[] takeinput() {
        int n;

        Scanner sc = new Scanner(System.in);
        // get the no of elements that are going to store the array
        System.out.println("Enter no. of elements you want to store : ");
        n = sc.nextInt();

        Integer[] arr = new Integer[n];
        System.out.println("Enter the elements to the array : ");
        for (int i = 0; i < n; i++) {
            //read elements from the user & store them in array
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static <E extends Comparable> E max(E[] list) {
        E max = list[0]; //set 1st element in the array as the current maximum
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return  max;
    }

    public static void main(String[] args) {

        Integer[] ints = takeinput();
        System.out.println("Array elements : ");
        for (int i = 0; i < ints.length; i++)
            System.out.println(ints[i]);

        System.out.println("Maximum value in the array : " + max(ints));

    }
}
