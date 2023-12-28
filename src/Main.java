public class Main {
    public static void main(String[] args) {
        // Массивы данных
        /*int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 21;
        nums[2] = 32;
        nums[3] = 24;
        nums[4] = 55;

        int res = nums[1] + nums[2];

        System.out.println(res);

        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};

        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Element: " + nums2[i]);
        }*/
/*
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for (int j : arr) {
            if (j < min) min = j;
        }
        System.out.println("Minimal: " + min);*/

        // Многоиерные массивы

        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][] {
                {1, 2, 3},
                {2, 3, 5},
                {1, 3, 5}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]);
                if (j != nums.length - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }
}