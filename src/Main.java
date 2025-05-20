import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Example using Array (fixed size)
        int[] numberArray = new int[3];
        numberArray[0] = 10;
        numberArray[1] = 20;
        numberArray[2] = 30;

        System.out.println("Array values:");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }

        // Example using ArrayList (dynamic size)
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40); // ArrayList resizes automatically

        System.out.println("\nArrayList values:");
        for (int num : numberList) {
            System.out.println(num);
        }

        // Key Differences:
        // Array = fixed size, primitive types allowed
        // ArrayList = dynamic size, stores objects only, has built-in methods
    }
}

