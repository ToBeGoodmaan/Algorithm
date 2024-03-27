import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int min = arr[0];
        int max = arr[0];

        for (int i=0;i<arr.length;i++) {
            if(min>arr[i]) min = arr[i];
            if(max<arr[i]) max = arr[i];
        }
        System.out.println(min+" "+max);

    }
}