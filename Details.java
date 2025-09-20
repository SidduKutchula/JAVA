
import java.util.*;

class Details {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}