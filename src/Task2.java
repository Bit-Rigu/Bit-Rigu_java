import java.util.Scanner;

public class Task2 {

    private static final String name = "Вячеслав";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.equals(name)) {
            System.out.println(String.format("Привет, %s", name));
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
