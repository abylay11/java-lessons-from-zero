public class Main {
    public static void main(String[] args) {
        System.out.println("Переменные и типы данных");

        // 1) Тип данных
        // 2) Назвать переменную
        // 3) Присвоить значение

        int age; // Переменная без значения
        age = 23;
        System.out.println(age);
        age = 15;
        System.out.println(age);

        int age2 = 12;
        System.out.println(age2);

        System.out.println("Возраст: " + age2 + ".");

        // ---

        byte byteType = 123; // -128 <-> 127; int = 4 byte
        System.out.println(byteType);

        // byte - from -128 to 127 1 byte
        // short - from -32768 to 32767 2 bytes
        // int - 4 bytes
        // long

        float num = 4.123f;
        double num2 = 13.21312313;

        char ch = '5';

        String user_name = "Bob";
        System.out.println(user_name);

        boolean isHappy = true;
        System.out.println(isHappy);
        isHappy = false;

        System.out.println(isHappy);
    }
}