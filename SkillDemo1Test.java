import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    
    @Test
    public void test1() {
        assertEquals(8, SkillDemo1.multiply(2, 4));
        // expected to fail
    }

}
