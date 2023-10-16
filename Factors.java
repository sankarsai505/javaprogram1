import java.util.*;

public class Factors {
    public static void main(String[] args) {
        System.out.println("factors of a number");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println("factors are:" + i);
                count++;
            }
        }
        System.out.println("number of factors are :" + count);

    }

}
