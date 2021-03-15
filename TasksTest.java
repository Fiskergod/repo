package ru.geekbrains.hworks.hw14;

/* Test 1: Написать набор тестов для этого метода (по 3-4 варианта входных данных).
           Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
   Test 2: Написать набор тестов для этого метода (по 3-4 варианта входных данных).
           [ 1 1 1 4 4 1 4 4 ] -> true
           [ 1 1 1 1 1 1 ] -> false
           [ 4 4 4 4 ] -> false
           [ 1 4 4 1 1 4 3 ] -> false */

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class TasksTest {
    Tasks tasks;

    public TasksTest() {
        this.tasks = new Tasks();
    }

    @Test
    public void returnValuesAfterLast4() {
        int[] input = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] output = {1, 7};

        Assert.assertArrayEquals(output, tasks.pullOut(input));
    }

    @Test
    public void returnEmptyArrayWhenLastElement4() {
        int[] input = {1, 2, 3, 4};
        int[] output = {};

        Assert.assertArrayEquals(output, tasks.pullOut(input));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void throwRuntimeExceptionWhenArrayDoesNotContain4() {
        int[] input = {1, 2, 3};
        int[] output = {};

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("В массиве нет ни одного элемента со значением 4");

        Assert.assertArrayEquals(output, tasks.pullOut(input));
    }

    @Test
    public void throwRuntimeExceptionWhenArrayContainsNoElements() {
        int[] input = {};
        int[] output = {};

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Хотя бы один элемент должен быть в массиве");

        Assert.assertArrayEquals(output, tasks.pullOut(input));
    }

    @Test
    public void checkMethodTest1() {
        int[] input = {2, 3, 4};
        Assert.assertTrue(tasks.checkArray(input));
    }

    @Test
    public void checkMethodTest2() {
        int[] input = {1, 2, 3, 4};
        Assert.assertTrue(tasks.checkArray(input));
    }

    @Test
    public void checkMethodTest3() {
        int[] input = {2, 3};
        Assert.assertFalse(tasks.checkArray(input));
    }

    @Test
    public void checkMethodTest4() {
        int[] input = {};
        Assert.assertFalse(tasks.checkArray(input));
    }
}