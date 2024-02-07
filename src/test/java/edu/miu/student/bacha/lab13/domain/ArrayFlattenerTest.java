package edu.miu.student.bacha.lab13.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static edu.miu.student.bacha.lab13.domain.ArrayFlattener.flattenArray;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;

public class ArrayFlattenerTest {
    //a. When the input is a legit 2-D nested array, [[1,3], [0], [4,5,9]].
    //b. When the input is a null.
    //c. Create a JUnit TestSuite containing your 2 test-cases defined above

    @Test
    void testFlattenArrayForLegitInput() {
        int[][] input = new int[][]{{1, 3}, {0}, {4, 5, 9}};
        int[] expected = new int[]{1, 3, 0, 4, 5, 9};
        int[] actual = flattenArray(input);
        assertThat("method works for valid input", Arrays.equals(expected, actual));
    }

    @Test
    public void testFlattenArrayForNullInput() {
        try {
            flattenArray(null);
        } catch (Exception exception) {
            assertThat(exception, isA(NullPointerException.class));
        }
    }

}