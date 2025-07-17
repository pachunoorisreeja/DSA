package DSAConcepts.Arrays;
public class ArrayDemo{

    public static void main(String[] args) {
        // 1. Array Declaration and Initialization
        int[] numbers = new int[5]; // Declares an array of 5 integers, initialized to 0s
        String[] names = {"Alice", "Bob", "Charlie"}; // Declares and initializes with values

        System.out.println("Initial numbers array:");
        printArray(numbers); // Output: [0, 0, 0, 0, 0]

        // 2. Accessing and Updating Elements (O(1) time)
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println("\nNumbers array after updates:");
        printArray(numbers); // Output: [10, 20, 30, 0, 0]

        System.out.println("Element at index 1: " + numbers[1]); // Output: 20

        // 3. Iterating through an Array (O(n) time)
        System.out.println("\nNames in array:");
        for (String name : names) { // Enhanced for loop
            System.out.println(name);
        }

        // 4. Searching for an element (Linear Search - O(n) time)
        int target = 30;
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break; // Stop once found
            }
        }
        if (foundIndex != -1) {
            System.out.println("\n" + target + " found at index: " + foundIndex);
        } else {
            System.out.println("\n" + target + " not found.");
        }

        // 5. Insertion (simulated, as arrays are fixed size) - O(n) time
        // To insert 25 at index 2, we need to shift elements to the right
        // Original: [10, 20, 30, 0, 0]
        // Target:   [10, 20, 25, 30, 0]
        int valueToInsert = 25;
        int insertIndex = 2;
        if (insertIndex >= 0 && insertIndex < numbers.length) {
            // Shift elements to the right from the end to the insertIndex
            for (int i = numbers.length - 1; i > insertIndex; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[insertIndex] = valueToInsert;
        }
        System.out.println("\nNumbers array after insertion of 25 at index 2:");
        printArray(numbers); // Output: [10, 20, 25, 30, 0]

        // 6. Deletion (simulated) - O(n) time
        // To delete element at index 3 (value 30)
        // Original: [10, 20, 25, 30, 0]
        // Target:   [10, 20, 25, 0, 0] (or whatever default value, then possibly resize)
        int deleteIndex = 3;
        if (deleteIndex >= 0 && deleteIndex < numbers.length) {
            // Shift elements to the left from the deleteIndex + 1
            for (int i = deleteIndex; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = 0; // Set last element to default value (or null for objects)
        }
        System.out.println("\nNumbers array after deletion at index 3:");
        printArray(numbers); // Output: [10, 20, 25, 0, 0]

        // 7. Array out of bounds exception
        try {
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nCaught expected exception: " + e.getMessage());
        }
    }

    // Helper method to print array contents
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}