
public class Main {
    public static void main(String[] args) {

        int milkAmount = 300; // ml
        int powderAmount = 6; // g
        int eggsCount = 6; // items
        int sugarAmount = 6; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

        if (appleCount > 5) {
            System.out.println("Apple Juice");
        }
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Pancake");
        }
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omlette");
        }
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
        }
    }
}