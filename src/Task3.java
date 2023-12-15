import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] arrayOfNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число ");
            arrayOfNumbers[i] = sc.nextInt();
        }
        System.out.println("Введенный массив: ");
        for(int num : arrayOfNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Элементы, кратные 3:");
        for (int num : arrayOfNumbers) {
            if (num % 3 == 0) System.out.print(num + " ");
        }
    }
}
