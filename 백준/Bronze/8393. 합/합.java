import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       
        int a;
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        for (int i = 1;i<=a;i++) {
            sum += i;    
        }
        System.out.println(sum);
    }
}