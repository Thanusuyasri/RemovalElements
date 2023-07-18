import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class RemovalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        Integer[] reversedNumbers = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            reversedNumbers[i] = a[a.length - 1 - i];
        }
        int cost = 0;
        for(int i = 0;i < n;i++)
        {
            cost += reversedNumbers[i]*(i+1);
        }
        System.out.println(cost);
    }
}
