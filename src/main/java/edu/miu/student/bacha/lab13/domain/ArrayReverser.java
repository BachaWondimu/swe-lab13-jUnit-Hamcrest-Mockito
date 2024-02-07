package edu.miu.student.bacha.lab13.domain;

import edu.miu.student.bacha.lab13.service.ArrayFlattenerService;

import java.util.stream.IntStream;

public class ArrayReverser {
    private final ArrayFlattenerService arrayFlattenerService;

    public ArrayReverser(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int [] reverseArray(int [][] array){
        int [] flattenArray = arrayFlattenerService.flattenArray(array);
        return IntStream.range(0,flattenArray.length)
                .map(i->flattenArray[flattenArray.length-1-i])
                .toArray();
    }
}
