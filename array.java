public class array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // Assign values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        String[] str = new String[5];
        System.out.println(str[0]); // This will print null since the array is not initialized with any values");
    }
    
}