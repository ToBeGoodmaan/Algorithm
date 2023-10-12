import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int total = in.nextInt();
        int count = in.nextInt();
        
        for (int i=0; i<count;i++){
            int price = in.nextInt();
            int num = in.nextInt();
            
            total = total - (price * num);
        }
        if(total == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}