import java.util.Scanner;

public class FirstLevel {
    public static void main(String[] args) {
        System.out.println("Task 1");
        countdownFor();
        countdownWhile();

        System.out.println("Task2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number");
        int n2 = scanner.nextInt();
        System.out.println("Sum of numbers that divisible by 3 is " + sumBetween(n1, n2));

        System.out.println("Task 3");
        sumAllNumbers();

        System.out.println("Task 4");
        System.out.println("Enter first year");
        int year1 = scanner.nextInt();
        System.out.println("Enter second year");
        int year2 = scanner.nextInt();
        System.out.println(countLeapYear(year1, year2));


    }

    private static void countdownFor() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Start");
    }

    private static void countdownWhile() {
        int i = 5;
        while (i >= 1) {
            System.out.println(i);
            i -= 1;
        }
        System.out.println("Start");
    }

    private static int sumBetween(int n1, int n2) {
        int sum = 0;
        for (int i = n1; i >= n2; i--) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static void sumAllNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can get a sum of numbers. Please enter all numbers, if you want to stop, enter 0 ");
        int sum = 0;
        int n;
        do {
            n = scanner.nextInt();
            sum += n;

        } while (n != 0);

        System.out.println(sum);

    }

    private static int countLeapYear(int year1, int year2) {
        int count = 0;
        for (int i = year1; i <= year2; i++) {
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
                count++;
            }

        }
        return count;
    }

}
