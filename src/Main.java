public class Main {
    public static void main(String[] args) {
        // Циклы
       /* for(float i = 100; i > 10; i /= 2) {
            System.out.println("Element: " + i);
        }*/

        /*int i = 0;
        while (i <= 10) {
            System.out.println("Element: " + i);
            i++;
        }*/
       /* int i = 100;
        do {
            System.out.println("Element: " + i);
            i *= 100;
        } while (i < 10);*/

        for (int i = 5; i < 25; i+=2) {
            if (i % 3 == 0) continue;

            if (i >= 17) break;
            System.out.println("Element: " + i);
        }
    }
}