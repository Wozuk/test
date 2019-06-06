package test.org;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int quanta;

        Scanner reader = new Scanner(System.in);
        ArrayList<Item> basket = new ArrayList<Item>(3);

        System.out.print("Apple Quantity ?");
        quanta = reader.nextInt();
        basket.add(new Item("Apple", 0.2, 2, quanta));

        System.out.print("Orange Quantity ?");
        quanta = reader.nextInt();
        basket.add(new Item("Orange", 0.5, 0, quanta));

        System.out.print("Watermelon Quantity ?");
        quanta = reader.nextInt();
        basket.add(new Item("Watermelon", 0.8, 3, quanta));

        System.out.printf("%.1f", Methodes.calculeDuPanier(basket));



    }

}