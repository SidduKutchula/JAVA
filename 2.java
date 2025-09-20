import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println("Enter a number" + num);
        if (num > 0) {
            System.out.println("Positive" + num);
        } else if (num == 0) {
            System.out.println("Zero" + num);
        } else {
            System.out.println("Negitive");
        }
    }
}