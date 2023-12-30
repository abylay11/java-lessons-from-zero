public class Person {

    private static int count;

    public Person() {
        count++;
    }

    public static void getCount() {
        System.out.println("Количество: " + count);
    }

}
