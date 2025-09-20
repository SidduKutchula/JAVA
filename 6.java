
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Switch Case");
        Scanner sc = new Scanner(System.in);
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();
       int choice = sc.nextInt();
        switch(choice){
            case 1:{
                System.out.println("Addition:"+(a+b));
            }
            case 2:{
                System.out.println("Substraction:"+(a-b));
            }
            case 3:
                {
                    System.out.println("Multiplication:"+(a*b));
                }
                case 4:{
                    if(b!=0){
                    System.out.println("Division:"+(a/b));
                }
                else
                {
                    System.out.println("Not Divisible");
                }
                case 5:{
                    System.out.println("Modulus:"+(a % b));
                    
                }
            default:{
                System.out.println("Invalid Choice");
            }
            sc.close();
        
    }
} {
    
}
