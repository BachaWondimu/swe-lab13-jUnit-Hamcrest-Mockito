package edu.miu.student.bacha.lab13.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class ArrayFlattenerService {
    public int[] flattenArray(int[][] inputArray) throws NullPointerException {
        if (inputArray == null)
            throw new NullPointerException("Input array cannot be null");
        return Arrays.stream(inputArray)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
