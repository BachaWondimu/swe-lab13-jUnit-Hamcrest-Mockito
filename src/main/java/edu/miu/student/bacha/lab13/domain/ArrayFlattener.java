package edu.miu.student.bacha.lab13.domain;

import java.util.Arrays;

public class ArrayFlattener {
    //a. When the input is a legit 2-D nested array, [[1,3], [0], [4,5,9]].
    //b. When the input is a null.
    //c. Create a JUnit TestSuite containing your 2 test-cases defined above

    public static int[] flattenArray(int[][] inputArray) throws NullPointerException {
        if (inputArray == null)
            throw new NullPointerException("Input array cannot be null");
        return Arrays.stream(inputArray)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
