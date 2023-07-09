import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        if(n == 1) {
            System.out.print(n+ " ");
            System.out.print(n-1);
        } else {
            while(n != 1) {
                System.out.print(n+ " ");
                if(n%2 == 0) {
                    n /= 2;
                } else {
                    n = (n * 3)+1;
                }

                if(n == 1) {
                    System.out.print(n + " ");
                    System.out.print(m);
                }
            }
        }
        sc.close();
    }
}