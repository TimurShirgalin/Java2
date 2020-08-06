package Lesson5;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) {
        method1();
        method2();
    }
    public static void method1() {
        Arrays.fill(arr, 1);
        count(arr, "Method1");
        System.out.println();
    }

    public static void method2() {
        Arrays.fill(arr, 1);
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        System.out.println("Split array time: " + (System.currentTimeMillis() - a) + " ms");

        Thread thread1 = new Thread(() -> count(a1, "Thread1"));
        Thread thread2 = new Thread(() -> count(a2, "Thread2"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Link array time: " + (System.currentTimeMillis() - a) + " ms");
    }

    public static void count(float[] array, String str) {
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(str + " running time: " + (System.currentTimeMillis() - currentTime) + " ms");
    }
}
