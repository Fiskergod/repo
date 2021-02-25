package ru.geekbrains.hworks.hw9;

/* 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого
      размера необходимо бросить исключение MyArraySizeException.
   2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
      Если в каком-то элементе массива преобразование не удалось, должно быть брошено исключение MyArrayDataException
      с детализацией, в какой именно ячейке лежат неверные данные.
   3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
        MyArrayDataException и вывести результат расчета. */

public class homeWork_9 {

    public static void main(String[] args) {

        String[][] array = new String[][] {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        try {
            try {
                int res = checkMethod(array);
                System.out.println(res);
            } catch (MyArraySizeException excep) {
                System.out.println("Превышен размер массива");
            }
        }
        catch (MyArrayDataException excep) {
            System.out.println("Некорректное значение масссива");
            System.out.println("Ошибка в ячейке :" + excep.i + "|" + excep.j);
        }
    }

    public static int checkMethod(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
