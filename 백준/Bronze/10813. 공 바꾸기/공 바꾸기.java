import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int x = 0; x < M; x++) {
            int temp;
            int i = sc.nextInt();
            int j = sc.nextInt();

            temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }
        sc.close();

        for (int baguni : arr) {
            System.out.print(baguni + " ");

        }
    }
}