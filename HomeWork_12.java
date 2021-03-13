package ru.geekbrains.hworks.HW12;

         /* Необходимо написать два метода, которые делают следующее:
    Task 1: Создают одномерный длинный массив.
    Task 2: Заполняют этот массив единицами.
    Task 3: Засекают время выполнения: long a = System.currentTimeMillis().
    Task 4: Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    Task 5: Проверяется время окончания метода System.currentTimeMillis().
    Task 6: В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
            Отличие первого метода от второго:
            * Первый просто бежит по массиву и вычисляет значения.
            * Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти
              массивы обратно в один.
            Примечание:
            System.arraycopy() — копирует данные из одного массива в другой:
            System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение,
            откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
            По замерам времени:
            Для первого метода надо считать время только на цикл расчета:
            for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки. */

public class homeWork_12 {

    private static final int SIZE = 1000000;
    private static final int H_SIZE = SIZE / 2;

    // Расчет нового значения по формуле.
    public synchronized float[] compute(final float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    // Первый метод.
    public void singleThread() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
        long a = System.currentTimeMillis();
        compute(arr);
        System.out.println("Время работы первого метода: " + (System.currentTimeMillis() - a));
    }

    // Второй метод с 2 потоками.
    public void doubleThread() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[H_SIZE];
        float[] arr2 = new float[H_SIZE];
        for (int i = 0; i < arr.length; i++);

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, H_SIZE);
        System.arraycopy(arr, H_SIZE, arr2, 0, H_SIZE);

        new Thread(() -> {
            float[] array1 = compute(arr1);
            System.arraycopy(array1, 0, arr1, 0, array1.length);
        }).start();

        new Thread(() -> {
            float[] array2 = compute(arr2);
            System.arraycopy(array2, 0, arr2, 0, array2.length);
        }).start();
             
        Synchronized (this) { 
            System.arraycopy(arr1, 0, arr, 0, H_SIZE);
            System.arraycopy(arr2, 0, arr, H_SIZE, H_SIZE);
        }     
        System.out.println("Время работы второго метода: " + (System.currentTimeMillis() - a));
    }

    public static void main(String[] args) {
        homeWork_12 o = new homeWork_12();
        o.singleThread();
        o.doubleThread();
    }
}
