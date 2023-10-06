import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int H = in.nextInt();
        int T = in.nextInt();
        in.close();
        if (T < 45 ) {
            H--;
            T= 60 - (45 - T);
            if(H<0) {
                H = 23;
            }
            System.out.println(H + " " + T);
        }
        else {
            System.out.println(H + " " + (T - 45));
        }
            
    }
}