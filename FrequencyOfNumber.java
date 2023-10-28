import java.util.Scanner;

public class FrequencyOfNumber {

    static int countFrequency(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
            // System.out.println(x+ " is " +count+ "times in given array");

        }
        return count;
    }

    public static void main(String fg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the " + n + " element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the x :");
        int x = sc.nextInt();
        System.out.println("count of x :" + countFrequency(arr, x));
    }
}
