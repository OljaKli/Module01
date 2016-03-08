package olja.klisho.task04;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ola-Mola on 08/03/16.
 */
public class Task04Test {

    @Test
    public void testEven() throws Exception {
        double ar[] = {1, 2, 3.01, 4, 5, 6};
        double max = Task04.maxSum(ar);
        assertEquals(7.01, max, 0.0001);
    }

    @Test
    public void testOdd() throws Exception {
        double ar[] = {1, 2, 3.01, 4, 5};
        double max = Task04.maxSum(ar);
        assertEquals(6.02, max, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmpty() throws Exception {
        double ar[] = {};
        double max = Task04.maxSum(ar);

    }
}