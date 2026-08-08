```java id="z6y8pr"
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);

        scanner.close();
    }
}
```
