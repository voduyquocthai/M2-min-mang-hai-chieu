import java.util.Arrays;
import java.util.Scanner;

public class MinMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[][];
        System.out.println("Enter rows:");
        int rows = input.nextInt();
        System.out.println("Enter columns:");
        int columns = input.nextInt();
        array = new int[rows][columns];
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                System.out.println("Enter");
                array[row][column] = input.nextInt();
            }
            System.out.println(Arrays.toString(array));

        }
        //
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int x : array[i]
            ) {
                if (min > x) {
                    min = x;
                }
            }
        }
        System.out.print("Giá trị lớn nhất trong mảng hai chiều là :" + min);
    }
}
