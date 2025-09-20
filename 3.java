import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("A is Largest" + a);
        } else if (b > a && b > c) {
            System.out.println("B is Largest" + b);
        } else {
            System.out.println("C is Largest");
        }
    }
}