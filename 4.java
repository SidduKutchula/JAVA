public

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();
        System.out.println("enter year");
        if(year%100 == 4){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}{

}
