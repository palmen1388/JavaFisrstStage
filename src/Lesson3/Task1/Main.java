package Lesson3.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Furniture furn = new Furniture();
        furn.setName(scanner.nextLine());
        furn.setColor(scanner.nextLine());
        furn.setType(scanner.nextLine());
        furn.createFurniture();
        System.out.println(furn);

    }
}
