public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        float[] array2 = new float[3];
        array2[0] = 1.57f;
        array2[1] = 7.654f;
        array2[2] = 9.986f;

        int[] array3 = {3, 7, 9};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array1 = new int[]{1, 2, 3};
        for (int index = 0; index < array1.length; index++) {
            if (index == array1.length - 1) {
                System.out.println(array1[index]);
                break;
            }
            System.out.print(array1[index] + " ");
        }

        float[] array2 = new float[]{1.57f, 7.654f, 9.986f};
        for (int index = 0; index < array2.length; index++) {
            if (index == array2.length - 1) {
                System.out.println(array2[index]);
                break;
            }
            System.out.print(array2[index] + " ");
        }

        int[] array3 = {3, 7, 9};
        for (int index = 0; index < array3.length; index++) {
            if (index == array3.length - 1) {
                System.out.println(array3[index]);
                break;
            }
            System.out.print(array3[index] + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array1 = new int[]{1, 2, 3};
        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.println(array1[index]);
                break;
            }
            System.out.print(array1[index] + " ");
        }

        float[] array2 = new float[]{1.57f, 7.654f, 9.986f};
        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.println(array2[index]);
                break;
            }
            System.out.print(array2[index] + " ");
        }

        int[] array3 = {3, 7, 9};
        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.println(array3[index]);
                break;
            }
            System.out.print(array3[index] + " ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array1 = new int[]{1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
            System.out.println(array1[i]);
        }
    }
}
