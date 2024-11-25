import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        FarhansArray yourArray = new FarhansArray();
        yourArray.performOperations();
        yourArray.printResults();
    }

    int sum;
    int difference;
    int product;

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void performOperations() {
        sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        difference = numbers[0] - sum;
        product = 1;
        for (int num : numbers) {
            product *= num;
        }
    }

    public void printResults() {
        System.out.println("Contents of the array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}
