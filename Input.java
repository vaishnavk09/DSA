import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        // Assign values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

       for(int i=0;i<numbers.length;i++)
       {
        numbers[i]=in.nextInt();
       }
        System.out.println("array elements:");
       for (int num:numbers) {
           System.out.println("array elements:");
           System.out.println(num+"");
       }   
       in.close();   
}}
