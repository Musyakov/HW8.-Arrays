public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array1 = new int[12];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;

        float[] array2 = new float[12];
        array2 [0] = 1.57f;
        array2 [1] = 7.654f;
        array2 [2] = 9.986f;

        int [ ] array3 = {3, 7, 9};
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] array1 = new int[12];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;
        System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);

        float[] array2 = new float[12];
        array2 [0] = 1.57f;
        array2 [1] = 7.654f;
        array2 [2] = 9.986f;
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);

        int [ ] array3 = {3, 7, 9};
        System.out.println(array3[0] + ", " + array3[1] + ", " + array3[2]);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] array1 = new int[12];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;
        System.out.println(array1[2] + ", " + array1[1] + ", " + array1[0]);

        float[] array2 = new float[12];
        array2 [0] = 1.57f;
        array2 [1] = 7.654f;
        array2 [2] = 9.986f;
        System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);

        int [ ] array3 = {3, 7, 9};
        System.out.println(array3[2] + ", " + array3[1] + ", " + array3[0]);
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] array1 = new int[12];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;
        for (int i = 0; i < 3; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
            System.out.println(array1[i]);
        }
    }
}
