import java.util.Random;
import models.*;

class QuickStart {
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

        listRandomFruit(fruitArray, fruitArray.length);
        listOddFruit(fruitArray);

        System.out.println("-----------------------------------------: END");
    }

    private static void listRandomFruit(String[] fruitArray, int listLength) {
        System.out.println();
        System.out.println("Random Fruit:");
        System.out.println("-----------------------------------------");

        // loop while i is less or equal to 10
        int i = 1;
        while (i <= listLength) {
            // get random item of fruit
            Random random = new Random();
            String x = fruitArray[random.nextInt(fruitArray.length)];

            // print out fruit
            System.out.println(i + " " + x);
            
            // increment
            i++;
        }
    }

    private static void listOddFruit(String[] fruitArray) {
        System.out.println();
        System.out.println("Odd Fruit:");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < fruitArray.length; i++){
            if (i % 2 != 0) {
                System.out.println("Odd fruit: " + fruitArray[i]);
            }
        }
    }
}