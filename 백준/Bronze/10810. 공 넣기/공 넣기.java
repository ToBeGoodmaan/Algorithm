import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = sc.nextInt();
        
        for(int x=0;x<M;x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int y=i;y<=j;y++){
                arr[y-1] = k;
            }
            }
            for(int i=0;i<N;i++){
                System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}