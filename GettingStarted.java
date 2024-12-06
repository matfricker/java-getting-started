import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import models.*;

class GettingStarted {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------: START");
        
        // instantiate fruit class
        Fruit apple = new Fruit("Apple (Version 1.0)");
        apple.Wave();

        System.out.println("-----------------------------------------");

        apple.setName("Banana (Version 2.0)");
        System.out.println("Apple's name changed to " + apple.getName());

        // array of fruit
        String[] fruitArray = { "Apple", "Banana", "Orange", "Peach", "Grape", "Kiwi", "Pineapple", "Mango" };

        listFruit(fruitArray);
        listFruitInRandomOrder(fruitArray);
        listOddFruit(fruitArray);

        System.out.println("-----------------------------------------: END");
    }

    private static void listFruit(String[] fruitArray) {
        System.out.println();
        System.out.println("Fruit in original order:");
        System.out.println("-----------------------------------------");

        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }

    private static void listFruitInRandomOrder(String[] fruitArray) {
        System.out.println();
        System.out.println("Fruit in random order:");
        System.out.println("-----------------------------------------");

        List<String> randomStrings = new ArrayList<String>();

        // loop while i is less or equal to 10
        int i = 1;
        while (i <= fruitArray.length) {
            // get random item of fruit
            Random random = new Random();
            String randomItem = fruitArray[random.nextInt(fruitArray.length)];

            if (!randomStrings.contains(randomItem)) {
                randomStrings.add(randomItem);
                i++;
            }
        }

        for (String fruit : randomStrings) {
            System.out.println(fruit);
        }
    }

    private static void listOddFruit(String[] fruitArray) {
        System.out.println();
        System.out.println("Odd Fruit:");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < fruitArray.length; i++){
            if (i % 2 != 0) {
                System.out.println(fruitArray[i]);
            }
        }
    }
}