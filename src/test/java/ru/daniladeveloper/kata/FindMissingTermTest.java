package ru.daniladeveloper.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ru.daniladeveloper.kata.FindMissingTerm.Solution;

@DisplayName("Sample tests")
class FindMissingTermTest {

    @Test
    @DisplayName("Increasing sequence: [1, 2, 4]")
    void testIncreasing_1() {
        assertEquals(3, Solution.findMissing(new int[]{ 1, 2, 4}), "Incorrect answer for [1, 2, 4]");
    }

    @Test
    @DisplayName("Increasing sequence: [1, 3, 4]")
    void testIncreasing_2() {
        assertEquals(2, Solution.findMissing(new int[]{ 1, 3, 4}), "Incorrect answer for [1, 3, 4]");
    }

    @Test
    @DisplayName("Decreasing sequence: [4, 2, 1]")
    void testDecreasing_1() {
        assertEquals(3, Solution.findMissing(new int[]{ 4, 2, 1}), "Incorrect answer for [4, 2, 1]");
    }

    @Test
    @DisplayName("Decreasing sequence: [4, 3, 1]")
    void testDecreasing_2() {
        assertEquals(2, Solution.findMissing(new int[]{ 4, 3, 1}), "Incorrect answer for [4, 3, 1]");
    }

    @Test
    @DisplayName("Constant sequence: [1, 1, 1]")
    void testConstant() {
        assertEquals(1, Solution.findMissing(new int[]{ 1, 1, 1}), "Incorrect answer for [1, 1, 1]");
    }

    @Test
    @DisplayName("Random test")
    void testRandom() {
        assertEquals(-1798,
            Solution.findMissing(new int[] {-18, -107, -196, -285, -374, -463, -552, -641, -730, -819, -908, -997, -1086, -1175, -1264, -1353, -1442, -1531, -1620, -1709, -1887, -1976, -2065, -2154, -2243, -2332, -2421, -2510, -2599, -2688, -2777, -2866, -2955}),
            "Incorrect Answer");
    }

}
