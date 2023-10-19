package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArray {
    @Test
    public void testGetMax(){
        Array tasks = new Array();
        int[] nums2 = {1, 2, 3, 5};
        int actual = tasks.getMax(nums2);
        Assertions.assertEquals(5,actual);
    }
}
