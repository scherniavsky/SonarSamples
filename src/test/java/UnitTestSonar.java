/**
 * Created by tkudryavtsev on 16/06/16.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTestSonar {
    @Test
    public void testFoo() throws Exception {
        SonarTest sonartest = new SonarTest();
        assertEquals("foo", sonartest.foo());
    }

    @Test
    public void testBoth() throws Exception {
        SonarTest sonartest = new SonarTest();
        assertEquals("toto", sonartest.toto());
        assertEquals("foo", sonartest.foo());
    }
}
