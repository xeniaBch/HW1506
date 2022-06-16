import java.util.Scanner;

public class SecondLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();

        if (number > 1) {
            //I tried to make number-1 and number/2, but there were too many operations))
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    System.out.println("It is composite number!");
                    return;
                }
            }
            System.out.println("It is prime!! ;)");


        } else {
            System.out.println("Wrong input. A prime number can only be a natural number more than 1");
        }


    }


}