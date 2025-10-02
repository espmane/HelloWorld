package World;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hvad er dit fornavn?: ");
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder("World");

        while (!sb.isEmpty()) {
            System.out.println("Hello " + sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.println("Hello ");

        for (int i = 0; i < name.length(); i++) {
            sb.append(name.charAt(i));
            System.out.println("Hello " + sb);
        }
    }
}