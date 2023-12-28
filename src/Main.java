public class Main {
    public static void main(String[] args) {
        // Методы в Java
//        info("Hello");
//        info("World");
//        String java = "Java";
//        info(java);

        int res = summa((short) 5, (short) 7);
        info(String.valueOf(res));

        byte[] nums1 = new byte[] {5, 6, 8};

        int sum1 = summaArray(nums1);
        System.out.println("Сумма 1: " + sum1);

        byte[] nums2 = new byte[] {5, 6, 8, 10, 22, 3};

        int sum2 = summaArray(nums2);
        System.out.println("Сумма 2: " + sum2);
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;

        for (byte i =0; i < arr.length; i++)
            summa += arr[i];


        return summa;
    }

    public static int summa(short a, short b) {
        int res = a + b;
        String result = "Результат: " + res;
        info(result);
        return res;
    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }
}