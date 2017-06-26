/**
 * Created by Julian on 26/06/2017.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class DinglemouseTest {

    @Test
    public void example() {
        assertEquals(0, DinglemouseSimplified.deadAntCount("ant ant ant ant"));
        assertEquals(0, DinglemouseSimplified.deadAntCount(null));
        assertEquals(2, DinglemouseSimplified.deadAntCount("ant anantt aantnt"));
        assertEquals(1, DinglemouseSimplified.deadAntCount("ant ant .... a nt"));

    }

}
