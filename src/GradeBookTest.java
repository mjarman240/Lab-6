import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {

    GradeBook g1;
    GradeBook g2;

    @Before
    public void setUp() throws Exception {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        g1.addScore(5);
        g1.addScore(72);
        g1.addScore(91);
        g1.addScore(100);
        g1.addScore(0);
        g2.addScore(62.2);
        g2.addScore(9.16);
        g2.addScore(99.4);
        g2.addScore(100.0);
        g2.addScore(81.3);
    }

    @After
    public void tearDown() throws Exception {
        g1 = g2 = null;
    }

    @Test
    public void testSum() {
        assertEquals(268, g1.sum(), .001);
        assertEquals(352.06, g2.sum(), .001);
    }

    @Test
    public void testMinimum() {
        assertEquals(0, g1.minimum(), .001);
        assertEquals(9.16, g2.minimum(), .001);
    }

    @Test
    public void finalScoreTest() {
        assertEquals(268, g1.finalScore(), .001);
        assertEquals(342.9, g2.finalScore(), .001);
    }

    @Test
    public void getScoreSizeTest() {
        assertEquals(5, g1.getScoreSize(), .001);
        assertEquals(5, g2.getScoreSize(), .001);
    }

    @Test
    public void toStringtest() {
        assertTrue(g1.toString().equals(" 5.0 72.0 91.0 100.0 0.0"));
        assertTrue(g2.toString().equals(" 62.2 9.16 99.4 100.0 81.3"));
    }
}
