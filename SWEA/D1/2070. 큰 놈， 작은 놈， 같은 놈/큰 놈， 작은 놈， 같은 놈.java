import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n > x) {
                System.out.println("#" + (i+1) + " >");
            }
            else if(n < x) {
                System.out.println("#" + (i+1) + " <");
            }
            else
                System.out.println("#" + (i+1) + " =");
        }
        sc.close();
    }
    
}