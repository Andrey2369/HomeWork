public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        ckekSumSign();
        printColor();
        compareNumb();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void ckekSumSign() {
        int a = 2;
        int b = 3;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 23;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value > 1 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 101) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumb() {
        int a = 2;
        int b = 3;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}