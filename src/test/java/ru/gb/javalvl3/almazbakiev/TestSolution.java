package ru.gb.javalvl3.almazbakiev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestSolution {

    @ParameterizedTest
    @MethodSource("dataForTestReturnArray")
    void testReturnArray(int[] sourceArray, int[] resultArray) {
        Assertions.assertArrayEquals(resultArray, Solution.returnNewArray(sourceArray));
    }

    private static Stream<Arguments> dataForTestReturnArray() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{5}),
                Arguments.of(new int[]{4, 2, 4, 1, 5}, new int[]{1, 5}),
                Arguments.of(new int[]{4, 4, 4, 4, 4}, new int[]{}),
                Arguments.of(new int[]{2, 4, 3, 2, 5}, new int[]{3, 2, 5})
        );
    }

    @Test
    void testReturnNull() {
        Assertions.assertNull(Solution.returnNewArray(null));
    }

    @ParameterizedTest
    @MethodSource("dataForTestThrowRuntimeException")
    void testThrowRuntimeException(int[] sourceArray) {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Solution.returnNewArray(sourceArray);
        });
    }

    public static Stream<Arguments> dataForTestThrowRuntimeException() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}),
                Arguments.of(new int[]{-1, -2, -3}),
                Arguments.of(new int[]{1, 2, 3, -1, -2, -3}),
                Arguments.of(new int[]{1, 2, 3, 11, 22, 33})
        );
    }

    @Test
    void testThrowEmptyArrayException() {
        Assertions.assertThrows(EmptyArrayException.class, () -> {
            Solution.returnNewArray(new int[0]);
        });
    }

    @ParameterizedTest
    @MethodSource("dataForTestHasArrayNumberOneAndFour")
    void testHasArrayNumberOneAndFour(int[] sourceArray) {
        Assertions.assertTrue(Solution.hasArrayNumberOneAndFour(sourceArray));
    }

    public static Stream<Arguments> dataForTestHasArrayNumberOneAndFour() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8}),
                Arguments.of(new int[]{2, 3, 4, 5, 6, 7, 1}),
                Arguments.of(new int[]{1, 2, 5, 6, 7, 8, 4}),
                Arguments.of(new int[]{4, 1, 1, 1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("dataForTestArrayNotHaveOneOrFour")
    void testArrayNotHaveOne(int[] sourceArray) {
        Assertions.assertFalse(Solution.hasArrayNumberOneAndFour(sourceArray));
    }

    public static Stream<Arguments> dataForTestArrayNotHaveOneOrFour() {
        return Stream.of(
                Arguments.of(new int[] {2, 3, 5, 6, 7, 8}),
                Arguments.of(new int[] {4, 4}),
                Arguments.of(new int[] {1, 1})
        );
    }

    @Test
    void testArrayNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Solution.hasArrayNumberOneAndFour(null);
        });
    }
}