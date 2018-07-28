package demo;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(JUnitQuickcheck.class)
public class HellTest {

    @Property
    public void testLength(String a, String b) {
        assertThat(a + b).hasSize(a.length() + b.length());
    }

}
