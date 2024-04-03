import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N+1];

        for (int i = 0; i <= N; i++) {
            arr[i] = i;
        }
        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            for(int y=0;y<(j-i)/2 + 1;y++){
                int temp = arr[i+y];
                arr[i+y] = arr[j-y];
                arr[j-y] = temp;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}