package fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if ((number % 3 == 0) & (number % 5 == 0)) {
                System.out.println(number + " FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println(number + " Fizz");
            } else if (number % 5 == 0) {
                System.out.println(number + " Buzz");
            } else {
                System.out.println(number + " no Fizz and no Buz");
            }
        }
    }
}