import java.util.Arrays;
public class SmallestAndLargest {
    public static void main(String[] args) {
        int arr[] = {6, 2, 9, 1, 5};
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Largest in given array is " +max);
        System.out.println("Smallest in given array is " +min);
    }
}

