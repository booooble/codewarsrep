import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumHelperTest {
    private NumHelper variabonacci;

    @Before
    public void setUp() throws Exception {
        variabonacci = new NumHelper();
    }

    @After
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    @Test
    public void testXbonacci() throws Exception {
        assertArrayEquals(new double[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, new double[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34},  0.0);
        assertArrayEquals(new double[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, variabonacci.xbonacci(new double[]{1, 1}, 10),  0.0);
        assertArrayEquals(new double[]{0, 0, 0, 0, 1, 1, 2, 4, 8, 16}, variabonacci.xbonacci(new double[]{0, 0, 0, 0, 1}, 10),  0.0);
        assertArrayEquals(new double[]{1, 0, 0, 0, 0, 0, 1, 2, 3, 6}, variabonacci.xbonacci(new double[]{1, 0, 0, 0, 0, 0, 1}, 10),  0.0);
    }
}