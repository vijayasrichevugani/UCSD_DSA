import java.math.BigInteger;
import java.util.*;
public class Max_Pairwise_Product{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int len = arr.length;

        if (arr[len - 1] < 0 || arr[len - 2] < 0) {
            System.out.println("pairs doesn't exist");
        }
        BigInteger a = BigInteger.valueOf(arr[len - 1]);
        
        BigInteger b = BigInteger.valueOf(arr[len - 2]);

        BigInteger product = a.multiply(b);
        System.out.println(product);
        scanner.close();
    }
}
