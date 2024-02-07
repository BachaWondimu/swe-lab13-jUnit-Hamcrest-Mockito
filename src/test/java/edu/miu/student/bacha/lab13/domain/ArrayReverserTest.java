package edu.miu.student.bacha.lab13.domain;

import edu.miu.student.bacha.lab13.service.ArrayFlattenerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;
@SpringBootTest
class ArrayReverserTest {
    //a. When the input is a legit 2-D nested array, such as [[1,3], [0], [4,5,9]].
    //b. When the input is a null.
    //In both of your unit test-cases, include code that verifies that the ArrayFlattenerService was indeed invoked and not just by-passed (e.g. by harding-coding the correct expected result/output from its invocation).
    //Finally, create a JUnit TestSuite named, ArrayReversorTestCases, containing your 2 test cases.

    ArrayReverser arrayReverser;
    @MockBean
    ArrayFlattenerService arrayFlattenerService;

    @BeforeEach
    void setUp() {

        arrayReverser=new ArrayReverser(arrayFlattenerService);
    }

    @AfterEach
    void tearDown() {
        arrayReverser=null;
    }

    @Test
    void testReverseArrayForLegitInput() {
        int[][] inputArray = {{1,2,3},{4},{5,6,7,8,9}};
        int[] expected = {9,8,7,6,5,4,3,2,1};

        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(new int[]{1,2,3,4,5,6,7,8,9});

        int[] actual = arrayReverser.reverseArray(inputArray);
        System.out.println(Arrays.toString(actual));
        assertThat(actual,equalTo(expected));
    }


}