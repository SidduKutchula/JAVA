import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowels = "aeiouAEIOU";
        String letter;
        letter = sc.next();
        System.out.println("Calculator");
        if (letter == vowels) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }
    }
}
